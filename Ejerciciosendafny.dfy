
method SumArray(a: array<int>, n: int) returns (s: int)
    requires 0 < n <= a.Length
    ensures s == sum(a, n)
{
    var suma, i := 0, 0;
    
    while i < n
        invariant suma == sum(a, i)
        invariant 0 <= i <= n
        invariant 0 <= i <= a.Length
    {
        suma := suma + a[i];
        i := i + 1;
    }
    s := suma;
}

function sum(a: array<int>, j: int): int
    requires 0 <= j <= a.Length
    reads a
{
    if j == 0 then 0 else sum(a, j-1) + a[j-1]
}
