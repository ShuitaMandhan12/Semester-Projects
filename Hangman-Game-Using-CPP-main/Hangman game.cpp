#include<iostream>
#include<windows.h>
#include<vector>
#include<fstream>
#include<string.h>
#include<time.h>
#include<cstdlib>

using namespace std;

void printbody(string message, bool printtop=true, bool printbottom=true)
	{
		if(printtop)
		{
			cout<<"+---------------------------------------+"<<endl;
			cout<<"|";
		}
	else 
	{
		cout<<"|";
	}
	bool front=true;
	for(int i=message.length();i<39;i++)
	{
		if(front)
		{
			message=" "+message;
		}
		else
		{
			message=message+" ";
		}

	front=!front;
	
	}
	cout<<message;

	if(printbottom)
	{
		cout<<"|"<<endl;
		cout<<"+---------------------------------------+"<<endl;
	}
	else
	{
		cout<<"|"<<endl;
	}
	}
	void drawhangman(int guess=0)
	{
		if(guess>=1)
		printbody("|",false,false);
		else 
		printbody("",false,false);

		if(guess>=2)
		printbody("|",false,false);
		else 
		printbody("",false,false);

        if(guess>=3)
		printbody("O",false,false);
		else 
		printbody("",false,false);

        if(guess==4)
		printbody("/  ",false,false);
		
		if(guess==5)
		printbody("/| ",false,false);
		
        if(guess>=6)
		printbody("/|\\",false,false);
		else 
		printbody("",false,false);

        if(guess>=7)
		printbody("|",false,false);
		else 
		printbody("",false,false);

       if(guess==8)
		printbody("/  ",false,false);
		
		if(guess>=9)
		printbody("/ \\",false,false);
		else 
		printbody("",false,false);
}
void printletters(string input, char from, char to)
{
	string s;
	for(char i=from;i<=to;i++)
	{
		if(input.find(i)==string::npos)
		{
			s+=i;
			s+=" ";
		}
		else
		s+="  ";
	}
	printbody(s,false,false);
}

void printavaiableletters(string taken)
{
	printletters(taken,'A','M');
    printletters(taken,'N','Z');
}
bool guesstheword(string word, string guessed)//placeholders of words that are not guessed yet
{  
	bool won=true;
	string s;
	for(int i=0;i<word.length();i++)
	{
		if(guessed.find(word[i])==string::npos)
		{
			won=false;
			s+="_ ";
		}
		else
		{   
		    s+=word[i];
			s+=" ";
		}
	}
	
	printbody(s,false);
	return won;
}
string loadrandomword(string path)
{
//	int store=0;
	string randomword;
    vector<string> s;
    ifstream reader("WORDSS.TXT");  
	if(reader.is_open()) 
	{
		while(getline(reader,randomword))//
       s.push_back(randomword);
		int randomline=rand() % s.size();
		randomword=s.at(randomline);
	 reader.close();
	 } 
	 return randomword;
}
int triesleft(string word,string guessed)
{
	int error=0;
	for(int i=0;i<guessed.length();i++)
	{
		if(word.find(guessed[i])==string::npos)
		error++;
	}
	return error;
}

int main()
{
    int age;  
   char ask,start; 
   string name,gender ;
   cout<<"Enter the Name:";
    cin>>name;

     cout<<"Enter the Age:";
      cin>>age;

       cout<<"Enter the Gender:";
        cin>>gender;

      cout<<"\t\t\t\t\t\t\tGame is about to begin:"<<endl<<"\t\t\t\t\t\t\tBest Of Luck: "<<"| "<<name<<" |"<<endl;
      Sleep(4000);
     
     system("cls");
     cout<<"\t\t\t\t\~~~~~       RULES OF THE GAME :      ~~~~~"<<endl;
     cout<<"\t\t\t\t******************************************************************************"<<endl; 
     cout<<"\t\t\t\tA.YOU HAVE 10 CHANCES TO GUESS THE WORD                                      *"<<endl;
     cout<<"\t\t\t\tB.FOR EVERY WRONG GUESS ONE PART FROM BODY WILL BE HANGED                    *"<<endl;
     cout<<"\t\t\t\tC.IF YOU DON'T GUESS THE WORD WITHIN GIVEN CHANCES YOU WILL LOSE THE GAME    *"<<endl;
     cout<<"\t\t\t\t******************************************************************************"<<endl;
     cout<<"\n\n";
	 char startt;
	 cout<<"CLICK (S) TO START:";cin>>startt;
     system("cls");

		srand(time(0));
		string guesses;
		string wordtoguess;
		wordtoguess=loadrandomword("WORDSS.TXT");
		int tries=0;
		bool win = false;
		do{
			system("cls");
		 printbody("HANGMAN");
		 drawhangman(tries);
		printbody("Available Letters");
	    printavaiableletters(guesses);
       	printbody("Guess the word");
        win= guesstheword(wordtoguess,guesses); 
		
		if(win)
		break;
		char x;
		
		cout<<">",cin>>x;
		
		if(guesses.find(x)== string::npos)
		guesses+=x;	
		
		tries=triesleft(wordtoguess,guesses);
		
		}
		while(tries<10);
       				
       				
					   if(win)
       				printbody("YOU WON!");
       				else
       				printbody("BAD LUCK:::YOU LOST THE GAME");
        
    
	         system("pause");
	        
return 0;
}
     
     
     
     
     



