#include <iostream>
#include <ctype.h>
using namespace std;
int main(void){
    string str; cin >> str;
    int k = 0;
    for(int i = 0; i < str.size(); ++i){
        if(isdigit(str[i])){
            k = (int) (str[i] - '0');
            continue;
        } else if(str[i] == '['){
            string aux = "";
            while(str[++i] != ']')
                aux += str[i];
            for(int j = 0; j < k; ++j)
                cout<<aux;
            ++i;
        } else {
            cout<<str[i];
        }
    }
    return 0;
}