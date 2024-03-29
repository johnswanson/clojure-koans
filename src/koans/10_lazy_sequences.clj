(meditations
  "There are a wide range of ways to generate a sequence"
  (= '(1 2 3 4) (range 1 5))

  "The range starts at the beginning by default"
  (= '(0 1 2 3 4) (range 5))

  "It's important to only take what you need from a big sequence"
  (= [0 1 2 3 4 5 6 7 8 9]
     (take 10 (range 100)))

  "You can also limit results by dropping what you don't need"
  (= [95 96 97 98 99]
     (drop 95 (range 100)))

  "Iteration provides an infinite lazy sequence"
  (= [0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19] (take 20 (iterate inc 0)))

  "Repetition is key"
  (= [:a :a :a :a :a :a :a :a :a :a ]
     (repeat 10 :a))

  "Iteration can be used for repetition"
  (= (repeat 100 :foo)
     (take 100 (iterate identity :foo))))
