set projectLocation=C:\Users\Denis.Kozyra\IdeaProjects\Class13Assingment
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause