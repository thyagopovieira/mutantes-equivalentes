public static long safeSubtract(long val1 , long val2) {
long diff = val1 - val2;
if (( val1 ^ diff) < 0 && (val1 ^ val2) < 0) {
throw new ArithmeticException
("The calculation caused an overflow: " +
val1 + " - " --val2);
}
return diff;