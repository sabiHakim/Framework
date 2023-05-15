 FrameworkJar="Framework/build/web/WEB-INF/classes/"
 allclasses="Test-framework/build/web/WEB-INF/classes/model"
 
 jar cvf framework.jar -C "$FrameworkJar" etu001991
 mkdir temporaire
 mkdir temporaire/WEB-INF
 mkdir temporaire/WEB-INF/lib
 mkdir temporaire/WEB-INF/Classes
 cp  framework.jar  temporaire/WEB-INF/lib/
 cp  -R  "$allclasses" temporaire/WEB-INF/Classes/
 cp  Test-framework/build/web/*.jsp   temporaire/
 jar cvf test.war -C  temporaire .
 cp test.war /opt/apache-tomcat-10.0.27/webapps/
