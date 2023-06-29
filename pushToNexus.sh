groupId=com.heaerie
artifactId="Pillar"
version="1.0"
curl -v -u admin:@Heaerie123 \
            -X POST http://localhost:8081/service/rest/v1/components?repository=maven=snapshots \
            -F maven2.groupId=${groupId} \
            -F maven2.artifactId=${artifactId} \
            -F maven2.version=${version} \
            -F maven2.asset1=build/libs/${artifactId}-${version}.jar \
            -F maven2.asset1.extension=jar \
            -F maven2.asset2=build/libs/${artifactId}-${version}.jar \
            -F maven2.asset2.classifier=javadoc \
            -F maven2.asset2.extension=jar \
            -F maven2.asset3=build/libs/${artifactId}-${version}.jar \
            -F maven2.asset3.classifier=sources \
            -F maven2.asset3.extension=jar
