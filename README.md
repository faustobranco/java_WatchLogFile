# Java Watch Live Log Files

[![Github All Releases](https://img.shields.io/github/downloads/faustobranco/java_WatchLogFile/total.svg)]()

Java example to watch live 2/n log files using threads

  ## Getting Started
  
The project, done in Java 8 using IntelliJ 2019.3 and Maven, simply shows examples of using org.apache.commons.io for log watch  **only for reference**:
The logs files in this example are in /logs.

This example shows very simply how to watch at two live log files in threads and show their update (together) in the console.

### Maven:

        <dependencies>  
            <dependency> 
                <groupId>commons-io</groupId>  
                <artifactId>commons-io</artifactId>  
                <version>2.6</version>  
            </dependency> 
        </dependencies>
        <build>  
           <plugins> 
                <plugin> 
                    <groupId>org.apache.maven.plugins</groupId>  
                    <artifactId>maven-compiler-plugin</artifactId>  
                    <configuration> 
                        <source>1.8</source>  
                        <target>1.8</target>  
                    </configuration> 
                </plugin> 
            </plugins>
       </build>


### Log Files

Location: /logs/app.log and /logs/debug.log

## Authors

-   **Fausto Branco** - _Initial work_ - [Git faustobranco](https://github.com/faustobranco)
