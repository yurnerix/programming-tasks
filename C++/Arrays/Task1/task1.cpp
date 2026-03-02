#include <iostream>
#include <vector>
using namespace std;

int main()
{
    setlocale(LC_ALL, "Ru");
    vector<double> profit(12);
    for (double& p : profit) {
        cin >> p;
    }

    int L, R;
    cin >> L >> R;

    L--;
    R--;

    int maxMonth = L;
    int minMonth = L;

    for (int i = L + 1; i <= R; ++i) {
        if (profit[i] > profit[maxMonth]) maxMonth = i;
        if (profit[i] < profit[minMonth]) minMonth = i;
    }

    cout << "Максимум в месяце:: " << maxMonth + 1 << '\n';
    cout << "Минимум в месяце: " << minMonth + 1 << '\n';

    return 0;

}
