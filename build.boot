(set-env! :source-paths #{"src"}
          :dependencies '[[org.apache.avro/avro "1.8.1" :scope "provided"]
                          [camel-snake-kebab "0.4.0" :scope "provided"]
                          [cheshire "5.6.3"]
                          [adzerk/bootlaces "0.1.13" :scope "test"]
                          [adzerk/boot-test "1.1.1" :scope "test"]])

(require '[adzerk.boot-test :as test])

(def +version+ "0.1.0-SNAPSHOT")

(task-options!
 pom {:project 'io.thdr/kfk-avro-bridge
      :version +version+
      :description "Converting Clojure data structures to Avro-compatible Java classes back and forth."
      :url "https://github.com/konukhov/kfk-avro-bridge"
      :scm {:url "https://github.com/konukhov/kfk-avro-bridge"}
      :license {"Eclipse Public License"
                "http://www.eclipse.org/legal/epl-v10.html"}})

(deftask test []
  (merge-env! :source-paths #{"test"})
  (test/test))