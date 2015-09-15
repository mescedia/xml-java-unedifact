#!/bin/bash


tmpFile="./.bindingconfig-all.tmp"
destDir="./bindingconfigs"

find -type f -name "bindingconfig.xml" > $tmpFile
lines=$(cat $tmpFile| wc -l)

if  [ "$lines" -eq 0 ]; then
	echo "please compile the smooks/unedifact project first and make sure this script is placed in the root of the project sources before running - bye ... "
	exit
fi

mkdir $destDir

sed -i '/^.*\_\_modelset\_definitions/d' $tmpFile
sed -i '/^.*classes/d' $tmpFile

while read line          
do
        version=$(echo $line | cut -d "/" -f 10 |  tr [a-z] [A-Z] )
        message=$(echo $line | cut -d "/" -f 11 |  tr [a-z] [A-Z] )
        bincfig=$(echo $line | cut -d "/" -f 12  )
        fn=$version-$message-$bincfig
        cp $line $destDir/$fn
        sed -i '/^.*edi\:reader/d' $destDir/$fn
        echo $destDir/$fn " created ..."
done < $tmpFile

rm $tmpFile

echo "done ..."
