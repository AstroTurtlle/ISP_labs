n1 = -5; n2 = 10;
n = n1:n2;
x = (n>=0);
stem(n, x);
xlabel('n'); ylabel('u[n]');
title('Secventa treapta unitara');
axis([n1 n2 -0.1 1.1]);

x = @(n) (n>=0);
figure;
stem(n, x(n));
xlabel('n'); ylabel('u[n]');
title('Secventa treapta unitara fplot');