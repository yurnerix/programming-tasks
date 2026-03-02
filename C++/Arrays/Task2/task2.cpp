#include <iostream>
#include <vector>
using namespace std;

int main() 
{
    setlocale(LC_ALL, "Rus");

    int n;
    cin >> n;
    vector<double> a(n);
    for (double& x : a) cin >> x;

    // сумма отрицательных
    double sumNeg = 0.0;
    for (double x : a)
        if (x < 0) sumNeg += x;

    // произведение между min и max
    int minIdx = 0, maxIdx = 0;
    for (int i = 1; i < n; ++i) {
        if (a[i] < a[minIdx]) minIdx = i;
        if (a[i] > a[maxIdx]) maxIdx = i;
    }
    if (minIdx > maxIdx) swap(minIdx, maxIdx);

    double prodBetween = 1.0;
    for (int i = minIdx + 1; i < maxIdx; ++i)
        prodBetween *= a[i];

    // произведение элементов с чётными индексами
    double prodEven = 1.0;
    for (int i = 0; i < n; i += 2)
        prodEven *= a[i];

    // сумма между первым и последним отрицательными
    int firstNeg = -1, lastNeg = -1;
    for (int i = 0; i < n; ++i) {
        if (a[i] < 0) {
            if (firstNeg == -1) firstNeg = i;
            lastNeg = i;
        }
    }

    double sumBetweenNeg = 0.0;
    if (firstNeg != -1 && lastNeg != -1 && firstNeg < lastNeg) {
        for (int i = firstNeg + 1; i < lastNeg; ++i)
            sumBetweenNeg += a[i];
    }

    cout << "Сумма отрицательных: " << sumNeg << '\n';
    cout << "Произведение между min и max: " << prodBetween << '\n';
    cout << "Произведение элементов с чётными индексами: " << prodEven << '\n';
    cout << "Сумма между отрицательными: " << sumBetweenNeg << '\n';

    return 0;
}