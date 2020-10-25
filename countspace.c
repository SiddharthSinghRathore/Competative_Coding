//count word between the string
/*#include<stdio.h>
void main()
{
	char name[100];
	int word=0,i=0;
	printf("\n ENtre the name");
	gets(name);
	printf("%s",name);
	char prevchar='\0';
	for(i=0;name[i]!='\0';i++)
	{
		if(name[i]==' ' || name[i]=='\0')
		{
			if(prevchar!=' ' && prevchar!='\n')
			{
				word++;
			}
		}
		prevchar=name[i];
	}
	printf("\n Total number of words:%d \n",word);

}*/
#include <stdio.h>
int main()
{
    char str[100];
    char prevChar;
    int i, words;

    /* Input string from user */
    printf("Enter any string: ");
    gets(str);

    i = 0;
    words = 0;
    prevChar = '\0'; // The previous character of str[0] is null

    /* Runs loop infinite times */
    while(1)
    {
        if(str[i]==' ' || str[i]=='\0')
        {
            /**
             * It is a word if current character is whitespace and
             * previous character is non-white space.
             */
            if(prevChar != ' ' && prevChar != '\0')
            {
                words++;
            }
        }

        /* Make the current character as previous character */
        prevChar = str[i];

        if(str[i] == '\0')
             break;
        else
             i++;
    }

    printf("Total number of words = %d", words);

    return 0;
}


