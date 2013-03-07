#!/usr/bin/perl

open(CVR, 'coverage.txt');

my $i = 0;
my $covr = 0;

while(<CVR>)
{
	chomp;
	my (undef, $run_covr) = split(/ /);
	$covr += $run_covr;
	$i++;
}

$covr /= $i if ($i > 0);
print "$covr\n";

close(CVR);

