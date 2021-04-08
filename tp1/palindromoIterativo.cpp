#include <iostream>
#include <string>

using namespace std;

class Palindrome{
public:
    string texto;

    bool static ePalindrome(string texto){
        for (int i = 0; i<texto.size(); i++)
        {
            if (texto.at(i) != texto.at(texto.size()-i-1))
                return false;
        }

        return true;
    }
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
