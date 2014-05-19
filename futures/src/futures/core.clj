(ns futures.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(future (Thread/sleep 4000)
  (println "I'll print after 4 seconds"))
(println "I'll print immediately")
