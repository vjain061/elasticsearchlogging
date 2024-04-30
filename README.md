# elasticsearchlogging
Default URL for elastic search
http://localhost:9200/

Logstash
How to start?
logstash -f logstash.conf

http://localhost:9600/

Kibana
http://localhost:5601/app/home#/

Steps to run and test....
1. Run the elastic search D:\Learning\Elastic-Stack\elasticsearch-8.13.2\bin\elasticsearch.bat
2. To run Logstash create a logstash.conf file in D:\Learning\Elastic-Stack\logstash-8.13.2 location. file is present in
3. command to up Logstash server logstash -f logstash.conf
4. To run Kibana first update the file D:\Learning\Elastic-Stack\kibana-8.13.2\config\kibana.yml and un-comment elasticsearch.hosts: ["http://localhost:9200"]
5. Command to up Kibana D:\Learning\Elastic-Stack\kibana-8.13.2\bin\kibana.bat

