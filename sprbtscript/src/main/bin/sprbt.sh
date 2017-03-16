#!/bin/sh
bin=`dirname $0`
cd $bin
source /etc/profile

#config param
mainclass='sprboot-0.0.1-SNAPSHOT.jar'

#jvmarg='-Xmx1024m -Xms512m -Xmn256m'
jvmarg=''

varpid=`ps -ef|grep $mainclass |grep -v grep|awk '{print $2}'`
fullcmd="java $jvmarg -jar $mainclass &"

servername=$mainclass
case "$1" in
restart)
	#restart action
	if test "x$varpid" != "x"
	then
	  kill -9 $varpid
	  sleep 1
	fi
	echo $fullcmd
	eval $fullcmd
	echo "$servername restarted" 
	;;
stop)
	#stop action
	if test "x$varpid" = "x"
	then
	  echo "fail. No $servername can be stopped."
	  exit
	fi
	kill -9 $varpid 
	echo "$servername stopped"
	;; 
start)
	#start action, default option
	if test "x$varpid" != "x"
	then
	  echo "fail. $servername is running already."
	  exit
	fi
	echo $fullcmd
	eval $fullcmd
	echo "$servername started"
	;;
*)
	echo "Usage: $0 {start|stop|restart}"
	exit 1
	;;       
esac      