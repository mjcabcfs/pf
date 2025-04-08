import gzip
from pathlib import Path
import csv

local_csv_file = str(Path(__file__).resolve().parent) + r'\local_csv_file.csv.gz'

column_name_list = ['group_common_company_id','duns_number','corporate_number','nttg_company_cd','affiliated_company_cd','diva_id']
record_dict_list =[{'group_common_company_id':'G000595999','duns_number':'717608895','corporate_number':'1030001126212','nttg_company_cd':None,'affiliated_company_cd':None,'diva_id':None}]

with gzip.open(local_csv_file, 'wt', encoding='utf-8', newline='\n') as f:
    writer = csv.DictWriter(f, fieldnames=column_name_list,doublequote=False,escapechar='\\',quotechar='"',lineterminator='\n',quoting=csv.QUOTE_ALL)
    writer.writerows(record_dict_list)