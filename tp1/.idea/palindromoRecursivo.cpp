#include <iostream>
#include <string>

using namespace std;

class Palindrome {
public:
    string texto;

    bool static ePalindrome(string texto) {
        if (texto.length() == 1) {
            return true;
        } else if (!texto.empty()) {
            if (texto.at(0) == texto.at(texto.length() - 1)) {
                ePalindrome(texto.substr(1, texto.length() - 1));
            } else {
                return false;
            }
        }
        return true;
    };
};

int main()
{
    Palindrome p;
    string fim = "FIM";
    while (p.texto != fim) {
        cin >> p.texto;
        if (Palindrome::ePalindrome(p.texto))
            cout << "SIM\n";
        else
            cout << "NAO\n";
    }
    return  0;
}