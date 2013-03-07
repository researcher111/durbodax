#!/usr/bin/perl

# format:
#    <all name="all classes">
#      <coverage type="class, %" value="100% (6/6)"/>
#      <coverage type="method, %" value="75%  (18/24)"/>
#      <coverage type="block, %" value="63%  (401/635)"/>
#      <coverage type="line, %" value="65%  (80.2/123)"/>


use strict;
use warnings;

my $coverage = -1;
my $xml = "";

open(XML, $ARGV[0]);
while(<XML>)
{
	my $line = $_;
	chomp $line;
	$xml .= "$line ";
}
close(XML);

$xml =~ m/all classes.*?coverage type="line, %" value="(.*?)%/g;

$coverage = $1;
$coverage = -1 if not defined $coverage;

print "$coverage\n";

