#!/bin/bash
echo -n "" > coverage.txt
i=0
FILES=*.class
for f in $FILES
do
  i=$((i+1))
  echo "Processing $f file..."
  filename=$(basename $f)
  extension=${filename##*.}
  filename=${filename%.*}

  java emmarun -r xml -cp $CLASSPATH:/home/cmc/projects/priest/subjectapps/DurboDax/bin -ix +durbodax* org.junit.runner.JUnitCore durbodax.commands.$filename
#  java emmarun -r xml -cp $CLASSPATH:/home/cmc/projects/priest/subjectapps/DurboDax/bin org.junit.runner.JUnitCore durbodax.commands.$filename

  echo -n "$i " >> coverage.txt
  ./emma_xml_reader.pl coverage.xml >> coverage.txt
done

#cat coverage_*.xml > coverage.xml
#rm coverage_*.xml

