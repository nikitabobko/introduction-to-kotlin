ls order* |
    while read -r file; do
        awk '{print $2}' "$file" |
            while read -r price; do
                if [ "$price" -gt 5 ]; then
                     echo "$file"
                     break
                fi
            done
    done |
    xargs awk '{print $2}' |
    paste -sd+ |
    bc
