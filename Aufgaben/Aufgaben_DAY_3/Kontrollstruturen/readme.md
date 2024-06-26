
a) int a = 0;
   for(int i = 0; i < 10; i++){ 
			a+=i;
	 }

     a = 45

c) int b = 0;
   for(b = 0; b < 10; b++){ 
			b+=b;

            // Hier ist b = 14
	 }

    // hier b = 15, weil nach dem letzten Schleifendurchlauf b nochmal um 1 erhöht wird, bevor die Ausgabe erfolgt

d) int c = 0;
   for(int i = 0; i < 10; i++){ 
			c+=c++;
	 }

    c = 0

**Bonus:**

int n = 123456789;
int m = 0;
while (n != 0){
	m = (10 * m) + (n % 10) ;
	n = n/10;
}

// hier wird die Zahlenreihe umgedreht, wenn man sich m ausgeben lässt.
// n ergibt hier 0

Initialwerte:

n = 123456789
m = 0

## Erste Iteration:

n % 10 gibt die letzte Ziffer von n, also 9.
m = (10 * 0) + 9 = 9
n = 123456789 / 10 = 12345678

## Zweite Iteration:

n % 10 gibt die letzte Ziffer von n, also 8.
m = (10 * 9) + 8 = 98
n = 12345678 / 10 = 1234567
