java -Xms4G -Xmx4G -agentlib:TakipiAgent -Dtakipi.name=SCart8 -Dtakipi.deployment.name=v2.19 -Dtakipi.etl -jar target/shopping-cart-demo-1.0.jar run_mode=ALL_WORKFLOWS no_of_threads=10 no_of_iterations=100000
