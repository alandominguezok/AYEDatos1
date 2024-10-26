
-- Utilizando listas por comprensión
-- Ejercicio 24
sucesores :: Num a => [a] -> [a]
sucesores as = [x+1 | x <- as]

-- Ejercicio 25
cuadrados :: [Int] -> [Int]
cuadrados as = [a*a | a <- as, a <- [0..]]

-- Ejercicio 26
paresMayores10 :: [Int] -> [Int]
paresMayores10 as = [x | x <- as, even x, x > 10 ] 
                                -- x `mod` 2 == 0

-- Ejercicio 27
divisores :: Integral a => a -> [a]
divisores a = [x | x <- [1..a], x `mod` a == 0]

-- Ejercicio 28
todosOcurrenEn :: Eq a => [a] -> [a] -> Bool
todosOcurrenEn [] _ = True 
todosOcurrenEn (x:xs) ys = elem x ys && todosOcurrenEn xs ys

-- Ejercicio 29
nPrimos :: Integral a => a -> [a]
nPrimos a = [x | x <- [2 .. a], length [y | y <- [1 .. a], x `mod` y == 0] == 2]

reps :: a -> Int -> [a]
reps a n = [a | i <- [1..n]]

-- Ejercicio 30
paresInf :: [Integer]
paresInf = [x*2 | x <- [2..]]

-- Ejercicio 31 Dadas dos listas de naturales, retornar su producto cartesiano.
produCartesiano :: [a] -> [b] -> [(a,b)]
produCartesiano as bs = [(a, b) | a <- as, b <- bs]

-- Ejercicio 32
numNat :: Integer
numNat = head [x | x <- [1..5000], 
                                x `mod` 1 == 0,
                                x `mod` 2 == 1,
                                x `mod` 3 == 2,
                                x `mod` 4 == 3,
                                x `mod` 5 == 4,
                                x `mod` 6 == 5,
                                x `mod` 7 == 6,
                                x `mod` 8 == 7,
                                x `mod` 9 == 8,
                                x `mod` 10 == 9]

-- Ejercicio 33 (*) Dadas una lista y un elemento retornar el número de ocurrencias del
-- elemento x en la lista ys.
occur :: (Eq a) => a -> [a] -> Int 
occur a bs = length [b | b <- bs, b == a]

-- Ejercicio 34
split2 :: [a] -> [([a], [a])]
split2 xs = [splitAt i xs| i <- [0..length xs]]

-- Ejercicio 35
sumaSeg :: [Int] -> Int
sumaSeg xs = sum [sum (take n xs) | n <- [0..length xs]]

-- Utilizando funciones de alto orden
-- Ejercicio 15

cuad :: Num a => a -> a
cuad n = n*n
cuads :: Num b => [b] -> [b]
cuads = map cuad

-- Ejercicio 16
divisor :: Integral a => a -> a -> Bool
divisor n i = mod n i == 0 
div2 :: Integral a => a -> [a]
div2 n = filter (divisor n) [1..n]

div3 :: (Integral a1, Num a2, Eq a2) => a2 -> [a1]
div3 6 = filter (divisor 6) [1,2,3,4,5,6]

-- Ejercicio 17
esPrimo :: Int -> Bool
esPrimo a
        | a < 2 = False
        | otherwise = all (\x -> a `mod` x /= 0) [2..a-1]

listaPrimos :: [Int] -> [Int]
listaPrimos as = filter (esPrimo) as 

-- Ejercicio 18
cuad2 :: Num a => a -> a
cuad2 n = n*n
cuadrados2 :: Num b => [b] -> [b]
cuadrados2 = map cuad2

sumacuad :: Num c => [c] -> c
sumacuad cs = foldl (+) 0 (cuadrados2 cs)

-- Ejercicio 19
suc :: Num a => a -> a
suc a = a+1
listasuc :: [Int] -> [Int]
listasuc xs = map (suc) xs  

-- Ejercicio 20
sumaLista :: [Int] -> Int
sumaLista xs = foldl (+) 0 xs

-- Ejercicio 21 *) Definir el factorial usando fold
factorial :: Integer -> Integer
factorial a 
        | a >= 0 = foldl (*) 1 [1..a]
        | otherwise = undefined

-- Ejercicio 22 (*) Redefinir la funcion and tal que and xs se verifica si todos los elementos
-- de xs son verdaderos
and2 :: [Bool] -> Bool
and2 as = foldl (&&) True as

-- Ejercicio 23 Usando foldl o foldr definir una funcion tam::[a]->Int que devuelve
-- la cantidad de elementos de una lista dada. Dar un ejemplo en los cuales
-- foldr y foldl evaluen diferente con los mismos parametros
tamFoldl :: [a] -> Int
tamFoldl as = foldl (\acc a -> acc + 1) 0 as

tamFoldr :: [a] -> Int
tamFoldr as = foldr (\a acc -> acc + 1) 0 as

-- si se intenta usar foldl con una lista infinita, se quedará atascado y no podrá 
-- completar la operación. En cambio, si usamos foldr, es posible que 
-- produzca resultados dependiendo de la forma en que se evalúa, pero para el caso 
-- específico de contar elementos, tanto foldl como foldr terminan 
-- siendo problemáticos con listas infinitas.

-- Ejercicio 1: Definir las funciones hd, tl, last e init
-- hd: Retorna el primer elemento de una lista
hd2 :: [a] -> a
hd2 (x:xs) = x

-- tl: Retorna toda la lista menos el primer elemento
tl2 :: [a] -> [a]
tl2 (x:xs) = xs

-- last: Retorna el último elemento de la lista
last2 :: [a] -> a
last2 [x] = x
last2 (x:xs) = last xs

-- init: Retorna toda la lista menos el último elemento
init2 :: [a] -> [a]
init2 [x] = []
init2 (x:xs) = x : init xs

-- Ejercicio 2: Definir una función que dada una lista, retorne la reversa de la misma
reversa :: [a] -> [a]
reversa [] = []
reversa (x:xs) = reversa xs ++ [x]

-- Ejercicio 3: Definir una función que dadas dos listas, decida si las listas son iguales
-- Ejercicio 3: Definir una función que dadas dos listas, decida si las listas son iguales
sonIguales :: (Eq a) => [a] -> [a] -> Bool
sonIguales xs ys = xs == ys

-- Ejercicio 4: Definir una función que dada una lista decida si es un palíndromo o no
esPalindromo :: (Eq a) => [a] -> Bool
esPalindromo xs = sonIguales xs (reversa xs)

-- Ejercicio 5: Definir una función que dado un número natural, decida si el mismo es primo o no
esPrimo2 :: Int -> Bool
esPrimo2 n
        | n < 2 = False
        | otherwise = all (\x -> n `mod` x /= 0) [2..n-1]

-- Ejercicio 6: Definir una función que dado un número natural n, retorne la lista de todos los números primos menores que n
primosMenores :: Int -> [Int]
primosMenores n = [x | x <- [2 .. n-1], esPrimo2 x] 

-- Ejercicio 7: Definir una función que dada una lista de números, devuelva la lista sólo con los números primos
filtrarPrimos2 :: [Int] -> [Int]
filtrarPrimos2 xs = [x | x <- xs, esPrimo2 x]

-- Ejercicio 8. (*) Investigue las definiciones de las funciones take y drop. Utilizando es-
-- tas funciones implemente una funcion cortar :: Int -> Int -> [Char]
--  ->[Char] que dados dos enteros i y j y un string w, devuelva el substring
-- que se encuentra entre las posiciones i y j.
cortar :: Int -> Int -> [Char] -> [Char]
cortar i j ws = drop (i-1) (take j ws)  

-- Ejercicio 9: Escribir una función que dado un número retorne la lista de sus dígitos
digitos :: Int -> [Int]
digitos n = map (\x -> read [x] :: Int) (show (abs n))

-- Ejercicio 10. (*) Utilizando ghc compile la funcion del ejercicio 2 para obtener codigo
-- ejecutable. Puede consultar el siguiente foro para ayudarse: Haskell en 5
-- pasos
-- ghc -o ejerp3 ejerp3.hs
-- Definición de main para poder compilar y ejecutar el programa
main :: IO ()
main = do
    putStrLn "Ingresa una lista de caracteres:"
    input <- getLine
    putStrLn ("La reversa es: " ++ reversa input)

-- Ejercicio 11: Generar una lista infinita de unos
unos :: [Int]
unos = 1 : unos

-- Ejercicio 12: Generar una lista infinita de naturales comenzando desde un número dado
naturalesDesde :: Int -> [Int]
naturalesDesde n = [n..]

-- Ejercicio 13: Generar una lista con los primeros n naturales
primerosNaturales :: Int -> [Int]
primerosNaturales n = take n [1..]

-- Ejercicio 14: Retornar los primeros 5 elementos de una lista infinita de enteros positivos
primerosCinco :: [Int]
primerosCinco = take 5 [1..]