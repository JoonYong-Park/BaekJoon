#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>

int main(void)
{
	int num;
	char a[51][51];
	int len;
	bool check = true;

	scanf("%d", &num);

	for (int i = 0; i < num; i++)
	{
		scanf("%s", a[i]);
	}

	len = strlen(a[0]);

	if (num == 1)
	{
		printf("%s", a[0]);
	}
	else
	{
		for (int i = 0; i < len; i++)
		{
			check = true;
			for (int j = 0; j < num; j++)
			{
				if (a[j][i] != a[0][i]) check = false;
			}
			if (check == false)
			{
				a[0][i] = '?';
			}
		}
		printf("%s", a[0]);
	}
}