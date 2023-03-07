n = -5:0.1:5;
interval1 = (n>0)&(n<=4);
interval2 = (n>=-4)&(n<=0);

x2 = @(n)((1-n/2).*interval1 + (1+n/2).*interval2);
subplot(2,2,1);
stem(n,x2(n-1));
xlabel('n');ylabel('x_2[n-1]');title('Semnal Discret x_2[n-1]');

subplot(2,2,2);
stem(n,x2(n+1));
xlabel('n');ylabel('x_2[n+1]');title('Semnal Discret x_2[n+1]');

subplot(2,2,3);
stem(n,x2(2*n));
xlabel('n');ylabel('x_2[2n]');title('Semnal Discret x_2[2n]');

subplot(2,2,4);
stem(n,x2(n/2));
xlabel('n');ylabel('x_2[n/2]');title('Semnal Discret x_2[n/2]');
