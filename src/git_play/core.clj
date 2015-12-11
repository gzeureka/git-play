(ns git-play.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "It's" (.toString (java.util.Date.)) "now")
)
