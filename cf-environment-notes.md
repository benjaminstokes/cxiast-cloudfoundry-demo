PS C:\Users\BenS\Documents\cx-development\iast\cxiast-cloudfoundry-demo> cf ssh cxiast-cloudfoundry-demo
vcap@8f425a07-ea70-4b79-74c2-0764:~$ pwd
/home/vcap
vcap@8f425a07-ea70-4b79-74c2-0764:~$ whoami
vcap
vcap@8f425a07-ea70-4b79-74c2-0764:~$ umask
0022
vcap@8f425a07-ea70-4b79-74c2-0764:~$ ls -al
total 16
drwx------ 1 vcap vcap   93 Apr 10 02:43 .
drwxr-xr-x 1 root root   18 Apr 10 01:48 ..
drwxr-xr-x 1 vcap vcap   72 Apr 10 02:43 app
-rw-r--r-- 1 vcap vcap  220 Apr  4  2018 .bash_logout
-rw-r--r-- 1 vcap vcap 3771 Apr  4  2018 .bashrc
drwxr-xr-x 3 vcap vcap   15 Apr 10 02:43 deps
drwxr-xr-x 2 vcap vcap    6 Apr 10 02:43 logs
-rw-r--r-- 1 vcap vcap  807 Apr  4  2018 .profile
drwxr-xr-x 2 vcap vcap    6 Apr 10 02:43 profile.d
-rw-r--r-- 1 vcap vcap 1188 Apr 10 02:43 staging_info.yml
drwxr-xr-x 4 vcap vcap   92 Apr 10 02:43 tmp
vcap@8f425a07-ea70-4b79-74c2-0764:~$ ls -alR
.:
total 16
drwx------ 1 vcap vcap   93 Apr 10 02:43 .
drwxr-xr-x 1 root root   18 Apr 10 01:48 ..
drwxr-xr-x 1 vcap vcap   72 Apr 10 02:43 app
-rw-r--r-- 1 vcap vcap  220 Apr  4  2018 .bash_logout
-rw-r--r-- 1 vcap vcap 3771 Apr  4  2018 .bashrc
drwxr-xr-x 3 vcap vcap   15 Apr 10 02:43 deps
drwxr-xr-x 2 vcap vcap    6 Apr 10 02:43 logs
-rw-r--r-- 1 vcap vcap  807 Apr  4  2018 .profile
drwxr-xr-x 2 vcap vcap    6 Apr 10 02:43 profile.d
-rw-r--r-- 1 vcap vcap 1188 Apr 10 02:43 staging_info.yml
drwxr-xr-x 4 vcap vcap   92 Apr 10 02:43 tmp

./app:
total 0
drwxr-xr-x 1 vcap vcap  72 Apr 10 02:43 .
drwx------ 1 vcap vcap  93 Apr 10 02:43 ..
drwxr-xr-x 4 vcap vcap  32 Apr 10 02:43 BOOT-INF
drwxr-xr-x 7 vcap vcap 150 Apr 10 02:43 .java-buildpack
drwxr-xr-x 3 vcap vcap  38 Apr 10 02:43 META-INF
drwxr-xr-x 3 vcap vcap  29 Apr  9 22:41 org

./app/BOOT-INF:
total 4
drwxr-xr-x 4 vcap vcap   32 Apr 10 02:43 .
drwxr-xr-x 1 vcap vcap   72 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap   47 Apr 10 02:43 classes
drwxr-xr-x 2 vcap vcap 4096 Apr 10 02:43 lib

./app/BOOT-INF/classes:
total 4
drwxr-xr-x 3 vcap vcap 47 Apr 10 02:43 .
drwxr-xr-x 4 vcap vcap 32 Apr 10 02:43 ..
-rwxr--r-- 1 vcap vcap  1 Apr  9 22:41 application.properties
drwxr-xr-x 3 vcap vcap 23 Apr  9 22:29 com

./app/BOOT-INF/classes/com:
total 0
drwxr-xr-x 3 vcap vcap 23 Apr  9 22:29 .
drwxr-xr-x 3 vcap vcap 47 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap 18 Apr  9 22:29 checkmarx

./app/BOOT-INF/classes/com/checkmarx:
total 0
drwxr-xr-x 3 vcap vcap 18 Apr  9 22:29 .
drwxr-xr-x 3 vcap vcap 23 Apr  9 22:29 ..
drwxr-xr-x 3 vcap vcap 30 Apr  9 22:29 iast

./app/BOOT-INF/classes/com/checkmarx/iast:
total 0
drwxr-xr-x 3 vcap vcap 30 Apr  9 22:29 .
drwxr-xr-x 3 vcap vcap 18 Apr  9 22:29 ..
drwxr-xr-x 2 vcap vcap 47 Apr 10 02:43 cloudfoundrydemo

./app/BOOT-INF/classes/com/checkmarx/iast/cloudfoundrydemo:
total 4
drwxr-xr-x 2 vcap vcap   47 Apr 10 02:43 .
drwxr-xr-x 3 vcap vcap   30 Apr  9 22:29 ..
-rwxr--r-- 1 vcap vcap 1528 Apr  9 22:40 CloudfoundryDemoApplication.class

./app/BOOT-INF/lib:
total 17832
drwxr-xr-x 2 vcap vcap    4096 Apr 10 02:43 .
drwxr-xr-x 4 vcap vcap      32 Apr 10 02:43 ..
-rwxr--r-- 1 vcap vcap   66540 Apr 10 02:43 classmate-1.4.0.jar
lrwxrwxrwx 1 vcap vcap      91 Apr 10 02:43 client_certificate_mapper-1.8.0_RELEASE.jar -> ../../.java-buildpack/client_certificate_mapper/client_certificate_mapper-1.8.0_RELEASE.jar
-rwxr--r-- 1 vcap vcap  114165 Apr 10 02:43 HdrHistogram-2.1.9.jar
-rwxr--r-- 1 vcap vcap 1155778 Apr 10 02:43 hibernate-validator-6.0.16.Final.jar
-rwxr--r-- 1 vcap vcap   66519 Apr 10 02:43 jackson-annotations-2.9.0.jar
-rwxr--r-- 1 vcap vcap  325619 Apr 10 02:43 jackson-core-2.9.8.jar
-rwxr--r-- 1 vcap vcap 1347236 Apr 10 02:43 jackson-databind-2.9.8.jar
-rwxr--r-- 1 vcap vcap   33391 Dec 15 23:06 jackson-datatype-jdk8-2.9.8.jar
-rwxr--r-- 1 vcap vcap  100674 Apr 10 02:43 jackson-datatype-jsr310-2.9.8.jar
-rwxr--r-- 1 vcap vcap    8642 Dec 15 23:06 jackson-module-parameter-names-2.9.8.jar
-rwxr--r-- 1 vcap vcap   26586 Feb 21  2018 javax.annotation-api-1.3.2.jar
-rwxr--r-- 1 vcap vcap   66469 Apr 10 02:43 jboss-logging-3.3.2.Final.jar
-rwxr--r-- 1 vcap vcap    4589 Feb 19 00:20 jul-to-slf4j-1.7.26.jar
-rwxr--r-- 1 vcap vcap   29779 Dec 15  2015 LatencyUtils-2.0.3.jar
-rwxr--r-- 1 vcap vcap  266283 Apr 10 02:43 log4j-api-2.11.2.jar
-rwxr--r-- 1 vcap vcap   17522 Feb  5 18:14 log4j-to-slf4j-2.11.2.jar
-rwxr--r-- 1 vcap vcap  290339 Apr 10 02:43 logback-classic-1.2.3.jar
-rwxr--r-- 1 vcap vcap  471901 Apr 10 02:43 logback-core-1.2.3.jar
-rwxr--r-- 1 vcap vcap  424943 Apr 10 02:43 micrometer-core-1.1.4.jar
-rwxr--r-- 1 vcap vcap   41139 Feb 19 00:15 slf4j-api-1.7.26.jar
-rwxr--r-- 1 vcap vcap  301298 Apr 10 02:43 snakeyaml-1.23.jar
-rwxr--r-- 1 vcap vcap  369018 Apr 10 02:43 spring-aop-5.1.6.RELEASE.jar
lrwxrwxrwx 1 vcap vcap      95 Apr 10 02:43 spring_auto_reconfiguration-2.7.0_RELEASE.jar -> ../../.java-buildpack/spring_auto_reconfiguration/spring_auto_reconfiguration-2.7.0_RELEASE.jar
-rwxr--r-- 1 vcap vcap  673302 Apr 10 02:43 spring-beans-5.1.6.RELEASE.jar
-rwxr--r-- 1 vcap vcap  952263 Apr 10 02:43 spring-boot-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap  509264 Apr 10 02:43 spring-boot-actuator-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap  438374 Apr 10 02:43 spring-boot-actuator-autoconfigure-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap 1262787 Apr 10 02:43 spring-boot-autoconfigure-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap     398 Apr  4 02:39 spring-boot-starter-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap     407 Apr  4 02:39 spring-boot-starter-actuator-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap     404 Apr  4 02:39 spring-boot-starter-json-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap     407 Apr  4 02:39 spring-boot-starter-logging-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap     406 Apr  4 02:39 spring-boot-starter-tomcat-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap     405 Apr  4 02:39 spring-boot-starter-web-2.1.4.RELEASE.jar
-rwxr--r-- 1 vcap vcap 1099880 Apr 10 02:43 spring-context-5.1.6.RELEASE.jar
-rwxr--r-- 1 vcap vcap 1293481 Apr 10 02:43 spring-core-5.1.6.RELEASE.jar
-rwxr--r-- 1 vcap vcap  280482 Apr 10 02:43 spring-expression-5.1.6.RELEASE.jar
-rwxr--r-- 1 vcap vcap   23762 Mar 31 08:23 spring-jcl-5.1.6.RELEASE.jar
-rwxr--r-- 1 vcap vcap 1384999 Apr 10 02:43 spring-web-5.1.6.RELEASE.jar
-rwxr--r-- 1 vcap vcap  800016 Apr 10 02:43 spring-webmvc-5.1.6.RELEASE.jar
-rwxr--r-- 1 vcap vcap 3285915 Apr 10 02:43 tomcat-embed-core-9.0.17.jar
-rwxr--r-- 1 vcap vcap  250080 Apr 10 02:43 tomcat-embed-el-9.0.17.jar
-rwxr--r-- 1 vcap vcap  265197 Apr 10 02:43 tomcat-embed-websocket-9.0.17.jar
-rwxr--r-- 1 vcap vcap   93107 Apr 10 02:43 validation-api-2.0.1.Final.jar

./app/.java-buildpack:
total 0
drwxr-xr-x 7 vcap vcap 150 Apr 10 02:43 .
drwxr-xr-x 1 vcap vcap  72 Apr 10 02:43 ..
drwxr-xr-x 2 vcap vcap  57 Apr 10 02:43 client_certificate_mapper
drwxr-xr-x 2 vcap vcap  60 Apr 10 02:43 container_security_provider
drwxr-xr-x 2 vcap vcap  27 Apr 10 02:43 java_security
drwxr-xr-x 5 vcap vcap 121 Apr 10 02:43 open_jdk_jre
drwxr-xr-x 2 vcap vcap  59 Apr 10 02:43 spring_auto_reconfiguration

./app/.java-buildpack/client_certificate_mapper:
total 12
drwxr-xr-x 2 vcap vcap   57 Apr 10 02:43 .
drwxr-xr-x 7 vcap vcap  150 Apr 10 02:43 ..
-rw-r--r-- 1 vcap vcap 9129 Apr 10 02:43 client_certificate_mapper-1.8.0_RELEASE.jar

./app/.java-buildpack/container_security_provider:
total 420
drwxr-xr-x 2 vcap vcap     60 Apr 10 02:43 .
drwxr-xr-x 7 vcap vcap    150 Apr 10 02:43 ..
-rw-r--r-- 1 vcap vcap 426069 Apr 10 02:43 container_security_provider-1.16.0_RELEASE.jar

./app/.java-buildpack/java_security:
total 4
drwxr-xr-x 2 vcap vcap  27 Apr 10 02:43 .
drwxr-xr-x 7 vcap vcap 150 Apr 10 02:43 ..
-rw-r--r-- 1 vcap vcap 599 Apr 10 02:43 java.security

./app/.java-buildpack/open_jdk_jre:
total 184
drwxr-xr-x 5 vcap vcap    121 Apr 10 02:43 .
drwxr-xr-x 7 vcap vcap    150 Apr 10 02:43 ..
-r--r--r-- 1 vcap vcap   1522 Apr  1 22:47 ASSEMBLY_EXCEPTION
drwxr-xr-x 2 vcap vcap    257 Apr 10 02:43 bin
drwxr-xr-x 9 vcap vcap   4096 Apr  1 22:47 lib
-r--r--r-- 1 vcap vcap  19274 Apr  1 22:47 LICENSE
drwxr-xr-x 4 vcap vcap     47 Apr  1 22:47 man
-rw-r--r-- 1 vcap vcap    237 Apr  1 22:47 release
-r--r--r-- 1 vcap vcap 153824 Apr  1 22:47 THIRD_PARTY_README

./app/.java-buildpack/open_jdk_jre/bin:
total 5480
drwxr-xr-x 2 vcap vcap     257 Apr 10 02:43 .
drwxr-xr-x 5 vcap vcap     121 Apr 10 02:43 ..
-rwxr-xr-x 1 vcap vcap    8400 Apr  1 22:47 java
-rwxr-xr-x 1 vcap vcap 2252161 May  8  2018 java-buildpack-memory-calculator-3.13.0_RELEASE
-rwxr-xr-x 1 vcap vcap    8512 Apr  1 22:47 jjs
-rwxr-xr-x 1 vcap vcap 3044528 Apr 10 02:43 jvmkill-1.16.0_RELEASE
-rwxr-xr-x 1 vcap vcap    8512 Apr  1 22:47 keytool
-rwxr-xr-x 1 vcap vcap    8568 Apr  1 22:47 orbd
-rwxr-xr-x 1 vcap vcap    8512 Apr  1 22:47 pack200
-rwxr-xr-x 1 vcap vcap    8512 Apr  1 22:47 policytool
-rwxr-xr-x 1 vcap vcap    8512 Apr  1 22:47 rmid
-rwxr-xr-x 1 vcap vcap    8512 Apr  1 22:47 rmiregistry
-rwxr-xr-x 1 vcap vcap    8512 Apr  1 22:47 servertool
-rwxr-xr-x 1 vcap vcap    8568 Apr  1 22:47 tnameserv
-rwxr-xr-x 1 vcap vcap  186408 Apr  1 22:47 unpack200

./app/.java-buildpack/open_jdk_jre/lib:
total 71060
drwxr-xr-x 9 vcap vcap     4096 Apr  1 22:47 .
drwxr-xr-x 5 vcap vcap      121 Apr 10 02:43 ..
drwxr-xr-x 4 vcap vcap     4096 Apr  1 22:47 amd64
drwxr-xr-x 2 vcap vcap        6 Apr  1 22:47 applet
-rw-r--r-- 1 vcap vcap     2375 Apr  1 22:47 calendars.properties
-rw-r--r-- 1 vcap vcap  3135616 Apr  1 22:47 charsets.jar
-rw-r--r-- 1 vcap vcap    84311 Apr  1 22:47 classlist
drwxr-xr-x 2 vcap vcap       89 Apr  1 22:47 cmm
-rw-r--r-- 1 vcap vcap     5916 Apr  1 22:47 content-types.properties
-r--r--r-- 1 vcap vcap     4134 Apr  1 22:47 currency.data
drwxr-xr-x 2 vcap vcap      203 Apr  1 22:47 ext
-rw-r--r-- 1 vcap vcap     3901 Apr  1 22:47 flavormap.properties
-rw-r--r-- 1 vcap vcap    14959 Apr  1 22:47 hijrah-config-umalqura.properties
drwxr-xr-x 3 vcap vcap       21 Apr  1 22:47 images
-rw-r--r-- 1 vcap vcap    96647 Apr  1 22:47 jce.jar
-rwxr-xr-x 1 vcap vcap    13168 Apr  1 22:47 jexec
-rw-r--r-- 1 vcap vcap   675585 Apr  1 22:47 jsse.jar
-rw-r--r-- 1 vcap vcap     4226 Apr  1 22:47 jvm.hprof.txt
-rw-r--r-- 1 vcap vcap     2455 Apr  1 22:47 logging.properties
drwxr-xr-x 2 vcap vcap      119 Apr  1 22:47 management
-rw-r--r-- 1 vcap vcap      381 Apr  1 22:47 management-agent.jar
-rw-r--r-- 1 vcap vcap     1922 Apr  1 22:47 meta-index
-rw-r--r-- 1 vcap vcap     5352 Apr  1 22:47 net.properties
-rw-r--r-- 1 vcap vcap    11390 Apr  1 22:47 psfontj2d.properties
-rw-r--r-- 1 vcap vcap     3793 Apr  1 22:47 psfont.properties.ja
-rw-r--r-- 1 vcap vcap  3509478 Apr  1 22:47 resources.jar
-rw-r--r-- 1 vcap vcap 65034934 Apr  1 22:47 rt.jar
drwxr-xr-x 3 vcap vcap      100 Apr  1 22:47 security
-rw-r--r-- 1 vcap vcap     1210 Apr  1 22:47 sound.properties
-rw-r--r-- 1 vcap vcap   105734 Apr  1 22:47 tzdb.dat

./app/.java-buildpack/open_jdk_jre/lib/amd64:
total 6776
drwxr-xr-x 4 vcap vcap    4096 Apr  1 22:47 .
drwxr-xr-x 9 vcap vcap    4096 Apr  1 22:47 ..
drwxr-xr-x 2 vcap vcap      23 Apr  1 22:47 jli
-rw-r--r-- 1 vcap vcap    1624 Apr  1 22:47 jvm.cfg
-rwxr-xr-x 1 vcap vcap   39176 Apr  1 22:47 libawt_headless.so
-rwxr-xr-x 1 vcap vcap  759248 Apr  1 22:47 libawt.so
-rwxr-xr-x 1 vcap vcap  470504 Apr  1 22:47 libawt_xawt.so
-rwxr-xr-x 1 vcap vcap   24496 Apr  1 22:47 libdt_socket.so
-rwxr-xr-x 1 vcap vcap  509736 Apr  1 22:47 libfontmanager.so
-rw-r--r-- 1 vcap vcap  735704 Apr  1 22:47 libfreetype.so.6
-rwxr-xr-x 1 vcap vcap  210720 Apr  1 22:47 libhprof.so
-rwxr-xr-x 1 vcap vcap   51432 Apr  1 22:47 libinstrument.so
-rwxr-xr-x 1 vcap vcap   47688 Apr  1 22:47 libj2gss.so
-rwxr-xr-x 1 vcap vcap   18296 Apr  1 22:47 libj2pcsc.so
-rwxr-xr-x 1 vcap vcap   79472 Apr  1 22:47 libj2pkcs11.so
-rwxr-xr-x 1 vcap vcap    8192 Apr  1 22:47 libjaas_unix.so
-rwxr-xr-x 1 vcap vcap   26016 Apr  1 22:47 libjava_crw_demo.so
-rwxr-xr-x 1 vcap vcap  227656 Apr  1 22:47 libjava.so
-rwxr-xr-x 1 vcap vcap    8024 Apr  1 22:47 libjawt.so
-rwxr-xr-x 1 vcap vcap  272312 Apr  1 22:47 libjdwp.so
-rwxr-xr-x 1 vcap vcap  257288 Apr  1 22:47 libjpeg.so
-rwxr-xr-x 1 vcap vcap   12776 Apr  1 22:47 libjsdt.so
-rwxr-xr-x 1 vcap vcap   13200 Apr  1 22:47 libjsig.so
-rwxr-xr-x 1 vcap vcap   83320 Apr  1 22:47 libjsoundalsa.so
-rwxr-xr-x 1 vcap vcap    8112 Apr  1 22:47 libjsound.so
-rwxr-xr-x 1 vcap vcap  522928 Apr  1 22:47 liblcms.so
-rwxr-xr-x 1 vcap vcap   51224 Apr  1 22:47 libmanagement.so
-rwxr-xr-x 1 vcap vcap 1039936 Apr  1 22:47 libmlib_image.so
-rwxr-xr-x 1 vcap vcap  116976 Apr  1 22:47 libnet.so
-rwxr-xr-x 1 vcap vcap   94024 Apr  1 22:47 libnio.so
-rwxr-xr-x 1 vcap vcap   17376 Apr  1 22:47 libnpt.so
-rwxr-xr-x 1 vcap vcap   29608 Apr  1 22:47 libsctp.so
-rwxr-xr-x 1 vcap vcap  441552 Apr  1 22:47 libsplashscreen.so
-rwxr-xr-x 1 vcap vcap  283848 Apr  1 22:47 libsunec.so
-rwxr-xr-x 1 vcap vcap  198280 Apr  1 22:47 libunpack.so
-rwxr-xr-x 1 vcap vcap   78056 Apr  1 22:47 libverify.so
-rwxr-xr-x 1 vcap vcap  127216 Apr  1 22:47 libzip.so
drwxr-xr-x 2 vcap vcap      59 Apr  1 22:47 server

./app/.java-buildpack/open_jdk_jre/lib/amd64/jli:
total 112
drwxr-xr-x 2 vcap vcap     23 Apr  1 22:47 .
drwxr-xr-x 4 vcap vcap   4096 Apr  1 22:47 ..
-rwxr-xr-x 1 vcap vcap 108800 Apr  1 22:47 libjli.so

./app/.java-buildpack/open_jdk_jre/lib/amd64/server:
total 16064
drwxr-xr-x 2 vcap vcap       59 Apr  1 22:47 .
drwxr-xr-x 4 vcap vcap     4096 Apr  1 22:47 ..
lrwxrwxrwx 1 vcap vcap       13 Apr  1 22:47 libjsig.so -> ../libjsig.so
-rwxr-xr-x 1 vcap vcap 16439976 Apr  1 22:47 libjvm.so
-rw-r--r-- 1 vcap vcap     1423 Apr  1 22:47 Xusage.txt

./app/.java-buildpack/open_jdk_jre/lib/applet:
total 4
drwxr-xr-x 2 vcap vcap    6 Apr  1 22:47 .
drwxr-xr-x 9 vcap vcap 4096 Apr  1 22:47 ..

./app/.java-buildpack/open_jdk_jre/lib/cmm:
total 256
drwxr-xr-x 2 vcap vcap     89 Apr  1 22:47 .
drwxr-xr-x 9 vcap vcap   4096 Apr  1 22:47 ..
-r--r--r-- 1 vcap vcap    784 Apr  1 22:47 CIEXYZ.pf
-r--r--r-- 1 vcap vcap    556 Apr  1 22:47 GRAY.pf
-r--r--r-- 1 vcap vcap    488 Apr  1 22:47 LINEAR_RGB.pf
-r--r--r-- 1 vcap vcap 234080 Apr  1 22:47 PYCC.pf
-r--r--r-- 1 vcap vcap   6876 Apr  1 22:47 sRGB.pf

./app/.java-buildpack/open_jdk_jre/lib/ext:
total 7580
drwxr-xr-x 2 vcap vcap     203 Apr  1 22:47 .
drwxr-xr-x 9 vcap vcap    4096 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap 3861228 Apr  1 22:47 cldrdata.jar
-rw-r--r-- 1 vcap vcap    8287 Apr  1 22:47 dnsns.jar
-rw-r--r-- 1 vcap vcap   44517 Apr  1 22:47 jaccess.jar
-rw-r--r-- 1 vcap vcap 1178927 Apr  1 22:47 localedata.jar
-rw-r--r-- 1 vcap vcap     617 Apr  1 22:47 meta-index
-rw-r--r-- 1 vcap vcap 2033505 Apr  1 22:47 nashorn.jar
-rw-r--r-- 1 vcap vcap   38304 Apr  1 22:47 sunec.jar
-rw-r--r-- 1 vcap vcap  265443 Apr  1 22:47 sunjce_provider.jar
-rw-r--r-- 1 vcap vcap  240691 Apr  1 22:47 sunpkcs11.jar
-rw-r--r-- 1 vcap vcap   68964 Apr  1 22:47 zipfs.jar

./app/.java-buildpack/open_jdk_jre/lib/images:
total 4
drwxr-xr-x 3 vcap vcap   21 Apr  1 22:47 .
drwxr-xr-x 9 vcap vcap 4096 Apr  1 22:47 ..
drwxr-xr-x 2 vcap vcap  248 Apr  1 22:47 cursors

./app/.java-buildpack/open_jdk_jre/lib/images/cursors:
total 32
drwxr-xr-x 2 vcap vcap  248 Apr  1 22:47 .
drwxr-xr-x 3 vcap vcap   21 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap 1274 Apr  1 22:47 cursors.properties
-rw-r--r-- 1 vcap vcap  153 Apr  1 22:47 invalid32x32.gif
-rw-r--r-- 1 vcap vcap  158 Apr  1 22:47 motif_CopyDrop32x32.gif
-rw-r--r-- 1 vcap vcap  153 Apr  1 22:47 motif_CopyNoDrop32x32.gif
-rw-r--r-- 1 vcap vcap  162 Apr  1 22:47 motif_LinkDrop32x32.gif
-rw-r--r-- 1 vcap vcap  153 Apr  1 22:47 motif_LinkNoDrop32x32.gif
-rw-r--r-- 1 vcap vcap  141 Apr  1 22:47 motif_MoveDrop32x32.gif
-rw-r--r-- 1 vcap vcap  153 Apr  1 22:47 motif_MoveNoDrop32x32.gif

./app/.java-buildpack/open_jdk_jre/lib/management:
total 32
drwxr-xr-x 2 vcap vcap   119 Apr  1 22:47 .
drwxr-xr-x 9 vcap vcap  4096 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap  3998 Apr  1 22:47 jmxremote.access
-r--r--r-- 1 vcap vcap  2856 Apr  1 22:47 jmxremote.password.template
-rw-r--r-- 1 vcap vcap 14630 Apr  1 22:47 management.properties
-r--r--r-- 1 vcap vcap  3376 Apr  1 22:47 snmp.acl.template

./app/.java-buildpack/open_jdk_jre/lib/security:
total 204
drwxr-xr-x 3 vcap vcap    100 Apr  1 22:47 .
drwxr-xr-x 9 vcap vcap   4096 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap   1273 Apr  1 22:47 blacklisted.certs
-rw-r--r-- 1 vcap vcap 154451 Apr  1 22:47 cacerts
-rw-r--r-- 1 vcap vcap   2466 Apr  1 22:47 java.policy
-rw-r--r-- 1 vcap vcap  40719 Apr  1 22:47 java.security
drwxr-xr-x 4 vcap vcap     38 Apr  1 22:47 policy

./app/.java-buildpack/open_jdk_jre/lib/security/policy:
total 0
drwxr-xr-x 4 vcap vcap  38 Apr  1 22:47 .
drwxr-xr-x 3 vcap vcap 100 Apr  1 22:47 ..
drwxr-xr-x 2 vcap vcap  58 Apr  1 22:47 limited
drwxr-xr-x 2 vcap vcap  58 Apr  1 22:47 unlimited

./app/.java-buildpack/open_jdk_jre/lib/security/policy/limited:
total 8
drwxr-xr-x 2 vcap vcap   58 Apr  1 22:47 .
drwxr-xr-x 4 vcap vcap   38 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap 1041 Apr  1 22:47 local_policy.jar
-rw-r--r-- 1 vcap vcap  621 Apr  1 22:47 US_export_policy.jar

./app/.java-buildpack/open_jdk_jre/lib/security/policy/unlimited:
total 8
drwxr-xr-x 2 vcap vcap  58 Apr  1 22:47 .
drwxr-xr-x 4 vcap vcap  38 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap 639 Apr  1 22:47 local_policy.jar
-rw-r--r-- 1 vcap vcap 621 Apr  1 22:47 US_export_policy.jar

./app/.java-buildpack/open_jdk_jre/man:
total 0
drwxr-xr-x 4 vcap vcap  47 Apr  1 22:47 .
drwxr-xr-x 5 vcap vcap 121 Apr 10 02:43 ..
lrwxrwxrwx 1 vcap vcap  11 Apr  1 22:47 ja -> ja_JP.UTF-8
drwxr-xr-x 3 vcap vcap  18 Apr  1 22:47 ja_JP.UTF-8
drwxr-xr-x 2 vcap vcap 194 Apr  1 22:47 man1

./app/.java-buildpack/open_jdk_jre/man/ja_JP.UTF-8:
total 0
drwxr-xr-x 3 vcap vcap  18 Apr  1 22:47 .
drwxr-xr-x 4 vcap vcap  47 Apr  1 22:47 ..
drwxr-xr-x 2 vcap vcap 194 Apr  1 22:47 man1

./app/.java-buildpack/open_jdk_jre/man/ja_JP.UTF-8/man1:
total 380
drwxr-xr-x 2 vcap vcap    194 Apr  1 22:47 .
drwxr-xr-x 3 vcap vcap     18 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap 137121 Apr  1 22:47 java.1
-rw-r--r-- 1 vcap vcap  12345 Apr  1 22:47 jjs.1
-rw-r--r-- 1 vcap vcap 111956 Apr  1 22:47 keytool.1
-rw-r--r-- 1 vcap vcap  17072 Apr  1 22:47 orbd.1
-rw-r--r-- 1 vcap vcap  15480 Apr  1 22:47 pack200.1
-rw-r--r-- 1 vcap vcap   5009 Apr  1 22:47 policytool.1
-rw-r--r-- 1 vcap vcap  20692 Apr  1 22:47 rmid.1
-rw-r--r-- 1 vcap vcap   5546 Apr  1 22:47 rmiregistry.1
-rw-r--r-- 1 vcap vcap  10070 Apr  1 22:47 servertool.1
-rw-r--r-- 1 vcap vcap  18684 Apr  1 22:47 tnameserv.1
-rw-r--r-- 1 vcap vcap   6371 Apr  1 22:47 unpack200.1

./app/.java-buildpack/open_jdk_jre/man/man1:
total 312
drwxr-xr-x 2 vcap vcap    194 Apr  1 22:47 .
drwxr-xr-x 4 vcap vcap     47 Apr  1 22:47 ..
-rw-r--r-- 1 vcap vcap 107134 Apr  1 22:47 java.1
-rw-r--r-- 1 vcap vcap   5921 Apr  1 22:47 jjs.1
-rw-r--r-- 1 vcap vcap  87894 Apr  1 22:47 keytool.1
-rw-r--r-- 1 vcap vcap  13149 Apr  1 22:47 orbd.1
-rw-r--r-- 1 vcap vcap  12592 Apr  1 22:47 pack200.1
-rw-r--r-- 1 vcap vcap   4204 Apr  1 22:47 policytool.1
-rw-r--r-- 1 vcap vcap  16948 Apr  1 22:47 rmid.1
-rw-r--r-- 1 vcap vcap   4418 Apr  1 22:47 rmiregistry.1
-rw-r--r-- 1 vcap vcap   8206 Apr  1 22:47 servertool.1
-rw-r--r-- 1 vcap vcap  16716 Apr  1 22:47 tnameserv.1
-rw-r--r-- 1 vcap vcap   5213 Apr  1 22:47 unpack200.1

./app/.java-buildpack/spring_auto_reconfiguration:
total 3564
drwxr-xr-x 2 vcap vcap      59 Apr 10 02:43 .
drwxr-xr-x 7 vcap vcap     150 Apr 10 02:43 ..
-rw-r--r-- 1 vcap vcap 3646309 Apr 10 02:43 spring_auto_reconfiguration-2.7.0_RELEASE.jar

./app/META-INF:
total 4
drwxr-xr-x 3 vcap vcap  38 Apr 10 02:43 .
drwxr-xr-x 1 vcap vcap  72 Apr 10 02:43 ..
-rwxr--r-- 1 vcap vcap 578 Apr  9 22:41 MANIFEST.MF
drwxr-xr-x 3 vcap vcap  32 Apr  9 22:41 maven

./app/META-INF/maven:
total 0
drwxr-xr-x 3 vcap vcap 32 Apr  9 22:41 .
drwxr-xr-x 3 vcap vcap 38 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap 31 Apr  9 22:41 com.checkmarx.iast

./app/META-INF/maven/com.checkmarx.iast:
total 0
drwxr-xr-x 3 vcap vcap 31 Apr  9 22:41 .
drwxr-xr-x 3 vcap vcap 32 Apr  9 22:41 ..
drwxr-xr-x 2 vcap vcap 43 Apr 10 02:43 cloudfoundry-demo

./app/META-INF/maven/com.checkmarx.iast/cloudfoundry-demo:
total 8
drwxr-xr-x 2 vcap vcap   43 Apr 10 02:43 .
drwxr-xr-x 3 vcap vcap   31 Apr  9 22:41 ..
-rwxr--r-- 1 vcap vcap  114 Apr  9 22:29 pom.properties
-rwxr--r-- 1 vcap vcap 1462 Apr  9 22:25 pom.xml

./app/org:
total 0
drwxr-xr-x 3 vcap vcap 29 Apr  9 22:41 .
drwxr-xr-x 1 vcap vcap 72 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap 18 Apr  9 22:41 springframework

./app/org/springframework:
total 0
drwxr-xr-x 3 vcap vcap 18 Apr  9 22:41 .
drwxr-xr-x 3 vcap vcap 29 Apr  9 22:41 ..
drwxr-xr-x 3 vcap vcap 20 Apr  9 22:41 boot

./app/org/springframework/boot:
total 4
drwxr-xr-x 3 vcap vcap   20 Apr  9 22:41 .
drwxr-xr-x 3 vcap vcap   18 Apr  9 22:41 ..
drwxr-xr-x 6 vcap vcap 4096 Apr  9 22:41 loader

./app/org/springframework/boot/loader:
total 80
drwxr-xr-x 6 vcap vcap  4096 Apr  9 22:41  .
drwxr-xr-x 3 vcap vcap    20 Apr  9 22:41  ..
drwxr-xr-x 2 vcap vcap  4096 Apr 10 02:43  archive
drwxr-xr-x 2 vcap vcap   201 Apr 10 02:43  data
-rwxr--r-- 1 vcap vcap  3608 Apr  4 02:23  ExecutableArchiveLauncher.class
drwxr-xr-x 2 vcap vcap  4096 Apr 10 02:43  jar
-rwxr--r-- 1 vcap vcap  1585 Apr  4 02:23  JarLauncher.class
-rwxr--r-- 1 vcap vcap  5699 Apr  4 02:23  LaunchedURLClassLoader.class
-rwxr--r-- 1 vcap vcap  1535 Apr  4 02:23 'LaunchedURLClassLoader$UseFastConnectionExceptionsEnumeration.class'
-rwxr--r-- 1 vcap vcap  4684 Apr  4 02:23  Launcher.class
-rwxr--r-- 1 vcap vcap  1502 Apr  4 02:23  MainMethodRunner.class
-rwxr--r-- 1 vcap vcap   266 Apr  4 02:23 'PropertiesLauncher$1.class'
-rwxr--r-- 1 vcap vcap  1484 Apr  4 02:23 'PropertiesLauncher$ArchiveEntryFilter.class'
-rwxr--r-- 1 vcap vcap 19737 Apr  4 02:23  PropertiesLauncher.class
-rwxr--r-- 1 vcap vcap  1953 Apr  4 02:23 'PropertiesLauncher$PrefixMatchingArchiveFilter.class'
drwxr-xr-x 2 vcap vcap    39 Apr  9 22:41  util
-rwxr--r-- 1 vcap vcap  1721 Apr  4 02:23  WarLauncher.class

./app/org/springframework/boot/loader/archive:
total 60
drwxr-xr-x 2 vcap vcap 4096 Apr 10 02:43  .
drwxr-xr-x 6 vcap vcap 4096 Apr  9 22:41  ..
-rwxr--r-- 1 vcap vcap  945 Apr  4 02:23  Archive.class
-rwxr--r-- 1 vcap vcap  302 Apr  4 02:23 'Archive$Entry.class'
-rwxr--r-- 1 vcap vcap  437 Apr  4 02:23 'Archive$EntryFilter.class'
-rwxr--r-- 1 vcap vcap  273 Apr  4 02:23 'ExplodedArchive$1.class'
-rwxr--r-- 1 vcap vcap 5243 Apr  4 02:23  ExplodedArchive.class
-rwxr--r-- 1 vcap vcap 1102 Apr  4 02:23 'ExplodedArchive$FileEntry.class'
-rwxr--r-- 1 vcap vcap 3837 Apr  4 02:23 'ExplodedArchive$FileEntryIterator.class'
-rwxr--r-- 1 vcap vcap 1487 Apr  4 02:23 'ExplodedArchive$FileEntryIterator$EntryComparator.class'
-rwxr--r-- 1 vcap vcap 7336 Apr  4 02:23  JarFileArchive.class
-rwxr--r-- 1 vcap vcap 1779 Apr  4 02:23 'JarFileArchive$EntryIterator.class'
-rwxr--r-- 1 vcap vcap 1081 Apr  4 02:23 'JarFileArchive$JarFileEntry.class'

./app/org/springframework/boot/loader/data:
total 24
drwxr-xr-x 2 vcap vcap  201 Apr 10 02:43  .
drwxr-xr-x 6 vcap vcap 4096 Apr  9 22:41  ..
-rwxr--r-- 1 vcap vcap  485 Apr  4 02:23  RandomAccessData.class
-rwxr--r-- 1 vcap vcap  282 Apr  4 02:23 'RandomAccessDataFile$1.class'
-rwxr--r-- 1 vcap vcap 4015 Apr  4 02:23  RandomAccessDataFile.class
-rwxr--r-- 1 vcap vcap 2688 Apr  4 02:23 'RandomAccessDataFile$DataInputStream.class'
-rwxr--r-- 1 vcap vcap 3263 Apr  4 02:23 'RandomAccessDataFile$FileAccess.class'

./app/org/springframework/boot/loader/jar:
total 152
drwxr-xr-x 2 vcap vcap  4096 Apr 10 02:43  .
drwxr-xr-x 6 vcap vcap  4096 Apr  9 22:41  ..
-rwxr--r-- 1 vcap vcap  4976 Apr  4 02:23  AsciiBytes.class
-rwxr--r-- 1 vcap vcap   616 Apr  4 02:23  Bytes.class
-rwxr--r-- 1 vcap vcap  3116 Apr  4 02:23  CentralDirectoryEndRecord.class
-rwxr--r-- 1 vcap vcap  5267 Apr  4 02:23  CentralDirectoryFileHeader.class
-rwxr--r-- 1 vcap vcap  4624 Apr  4 02:23  CentralDirectoryParser.class
-rwxr--r-- 1 vcap vcap   540 Apr  4 02:23  CentralDirectoryVisitor.class
-rwxr--r-- 1 vcap vcap   345 Apr  4 02:23  FileHeader.class
-rwxr--r-- 1 vcap vcap 11548 Apr  4 02:23  Handler.class
-rwxr--r-- 1 vcap vcap  3662 Apr  4 02:23  JarEntry.class
-rwxr--r-- 1 vcap vcap   299 Apr  4 02:23  JarEntryFilter.class
-rwxr--r-- 1 vcap vcap  2062 Apr  4 02:23 'JarFile$1.class'
-rwxr--r-- 1 vcap vcap  1233 Apr  4 02:23 'JarFile$2.class'
-rwxr--r-- 1 vcap vcap 15076 Apr  4 02:23  JarFile.class
-rwxr--r-- 1 vcap vcap  1593 Apr  4 02:23 'JarFileEntries$1.class'
-rwxr--r-- 1 vcap vcap 14010 Apr  4 02:23  JarFileEntries.class
-rwxr--r-- 1 vcap vcap  2046 Apr  4 02:23 'JarFileEntries$EntryIterator.class'
-rwxr--r-- 1 vcap vcap  1374 Apr  4 02:23 'JarFile$JarFileType.class'
-rwxr--r-- 1 vcap vcap   702 Apr  4 02:23 'JarURLConnection$1.class'
-rwxr--r-- 1 vcap vcap  9854 Apr  4 02:23  JarURLConnection.class
-rwxr--r-- 1 vcap vcap  4306 Apr  4 02:23 'JarURLConnection$JarEntryName.class'
-rwxr--r-- 1 vcap vcap  3650 Apr  4 02:23  StringSequence.class
-rwxr--r-- 1 vcap vcap  1813 Apr  4 02:23  ZipInflaterInputStream.class

./app/org/springframework/boot/loader/util:
total 12
drwxr-xr-x 2 vcap vcap   39 Apr  9 22:41 .
drwxr-xr-x 6 vcap vcap 4096 Apr  9 22:41 ..
-rwxr--r-- 1 vcap vcap 5203 Apr  4 02:23 SystemPropertyUtils.class

./deps:
total 0
drwxr-xr-x 3 vcap vcap 15 Apr 10 02:43 .
drwx------ 1 vcap vcap 93 Apr 10 02:43 ..
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 0

./deps/0:
total 0
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 .
drwxr-xr-x 3 vcap vcap 15 Apr 10 02:43 ..

./logs:
total 0
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 .
drwx------ 1 vcap vcap 93 Apr 10 02:43 ..

./profile.d:
total 0
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 .
drwx------ 1 vcap vcap 93 Apr 10 02:43 ..

./tmp:
total 0
drwxr-xr-x 4 vcap vcap 92 Apr 10 02:43 .
drwx------ 1 vcap vcap 93 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap 18 Apr 10 02:43 tomcat.5704065297529790619.8080
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 tomcat-docbase.1693799154173268648.8080

./tmp/tomcat.5704065297529790619.8080:
total 0
drwxr-xr-x 3 vcap vcap 18 Apr 10 02:43 .
drwxr-xr-x 4 vcap vcap 92 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap 20 Apr 10 02:43 work

./tmp/tomcat.5704065297529790619.8080/work:
total 0
drwxr-xr-x 3 vcap vcap 20 Apr 10 02:43 .
drwxr-xr-x 3 vcap vcap 18 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap 23 Apr 10 02:43 Tomcat

./tmp/tomcat.5704065297529790619.8080/work/Tomcat:
total 0
drwxr-xr-x 3 vcap vcap 23 Apr 10 02:43 .
drwxr-xr-x 3 vcap vcap 20 Apr 10 02:43 ..
drwxr-xr-x 3 vcap vcap 18 Apr 10 02:43 localhost

./tmp/tomcat.5704065297529790619.8080/work/Tomcat/localhost:
total 0
drwxr-xr-x 3 vcap vcap 18 Apr 10 02:43 .
drwxr-xr-x 3 vcap vcap 23 Apr 10 02:43 ..
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 ROOT

./tmp/tomcat.5704065297529790619.8080/work/Tomcat/localhost/ROOT:
total 0
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 .
drwxr-xr-x 3 vcap vcap 18 Apr 10 02:43 ..

./tmp/tomcat-docbase.1693799154173268648.8080:
total 0
drwxr-xr-x 2 vcap vcap  6 Apr 10 02:43 .
drwxr-xr-x 4 vcap vcap 92 Apr 10 02:43 ..


2019-04-10T01:30:33.94-0400 [CELL/0] OUT Cell 52f83266-c73f-4215-935f-960455846157 successfully destroyed container for instance f3c01954-da9f-4180-4e84-4232
   2019-04-10T01:30:33.98-0400 [CELL/0] OUT Cell 78d73e58-9a73-4317-bb61-c56223af688b successfully created container for instance 00737dc8-a1d0-4af7-47a9-72db
   2019-04-10T01:30:38.78-0400 [CELL/0] OUT Starting health monitoring of container
   2019-04-10T01:30:39.57-0400 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx444966K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=91609K
   2019-04-10T01:30:39.58-0400 [APP/PROC/WEB/0] ERR Error opening zip file or JAR manifest missing : /home/vcap/app/../contents754871117/deps/0/cxiast-java-agent/cx-launcher.jar
   2019-04-10T01:30:39.58-0400 [APP/PROC/WEB/0] OUT Error occurred during initialization of VM
   2019-04-10T01:30:39.58-0400 [APP/PROC/WEB/0] OUT agent library failed to init: instrument
   2019-04-10T01:30:39.63-0400 [APP/PROC/WEB/0] OUT Exit status 1
   2019-04-10T01:30:39.64-0400 [CELL/SSHD/0] OUT Exit status 0
   2019-04-10T01:30:46.14-0400 [API/0] OUT Process has crashed with type: "web"