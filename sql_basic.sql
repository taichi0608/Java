-- 問1 
-- 全選手の以下のデータを抽出してください。
-- ・背番号（uniform_num）
-- ・名前（name）
-- ・所属クラブ（club）

SELECT
  uniform_num,
  name,
  club
FROM players;

-- 問2
-- グループCに所属する国をすべて抽出してください。

SELECT *
FROM countries
WHERE group_name = 'C';

-- 問3
-- グループC以外に所属する国をすべて抽出してください。

SELECT *
FROM countries
WHERE group_name <> 'C';

-- 問4
-- 現時点で40歳以上の選手を抽出してください。（誕生日の人を含めてください。）
-- 検索タイミングによって実行結果が異なります。

SELECT *
FROM players
WHERE birth <= CURRENT_DATE - INTERVAL '40 years';

-- 問5
-- 身長が170cm未満の選手を抽出してください。

SELECT *
FROM players
WHERE height < 170;

-- 問6
-- FIFAランクが日本（46位）の前後10位に該当する国（36位～56位）を抽出してください。ただし、BETWEEN句を用いてください。

SELECT *
FROM countries
WHERE ranking BETWEEN 36 AND 56;

-- 問7
-- 選手のポジションがGK、DF、MFに該当する選手をすべて抽出してください。ただし、IN句を用いてください。

SELECT *
FROM players
WHERE position IN ('GK', 'DF', 'MF');

-- 問8
-- オウンゴールとなったゴールを抽出してください。goalsテーブルのplayer_idカラムにNULLが格納されているデータがオウンゴールを表しています。

SELECT *
FROM goals
WHERE player_id IS NULL;

-- 問9
-- オウンゴール以外のゴールを抽出してください。goalsテーブルのplayer_idカラムにNULLが格納されているデータがオウンゴールを表しています。

SELECT *
FROM goals
WHERE player_id IS NOT NULL;

-- 問10
-- 名前の末尾が「ニョ」で終わるプレイヤーを抽出してください。

SELECT *
FROM players
WHERE name LIKE '%ニョ';

-- 問11
-- 名前の中に「ニョ」が含まれるプレイヤーを抽出してください。

SELECT *
FROM players
WHERE name LIKE '%ニョ%';

-- 問12
-- 全選手の中から小柄な選手（身長が165cm未満か、体重が60kg未満）を抽出してください。

SELECT *
FROM players
WHERE height < 165
   OR weight < 60;

-- 問13
-- FWかMFの中で170未満の選手を抽出してください。ただし、ORとANDを使用してください。

SELECT *
FROM players
WHERE (position = 'FW' OR position = 'MF')
  AND height < 170;

-- 問14
-- ポジションの一覧を重複なしで表示してください。グループ化は使用しないでください。

SELECT DISTINCT position
FROM players;

-- 問15
-- 全選手の身長と体重を足した値をカラム名「体力指数」として表示してください。合わせて選手の名前、選手の所属クラブも表示してください。

SELECT
  name,
  club,
  height + weight AS 体力指数
FROM players;

-- 問16
-- 全ての選手を身長の大きい順に表示してください。同じ身長の選手は体重の重い順に表示してください。

SELECT *
FROM players
ORDER BY height DESC, weight DESC;

-- 問17
-- 全てのゴール情報を出力してください。ただし、オウンゴール（player_idがNULLのデータ）はCASE関数を使用してplayer_idを「9999」と表示してください。

SELECT
  id,
  pairing_id,
  goal_time,
  CASE
    WHEN player_id IS NULL THEN 9999
    ELSE player_id
  END AS player_id
FROM goals;

-- 問18
-- 全ての選手の平均身長、平均体重を表示してください。

SELECT
  AVG(height) AS avg_height,
  AVG(weight) AS avg_weight
FROM players;

-- 問19
-- 日本の選手（player_idが714から736）が上げたゴール数を表示してください。

SELECT COUNT(*) AS goal_count
FROM goals
WHERE player_id BETWEEN 714 AND 736;

-- 問20
-- 全ての選手の中で最も高い身長と、最も軽い体重を表示してください。

SELECT
  MAX(height) AS max_height,
  MIN(weight) AS min_weight
FROM players;

-- 問21
-- CグループのFIFAランクの合計値を表示してください。

SELECT SUM(ranking) AS total_rank
FROM countries
WHERE group_name = 'C';

-- 問22
-- 全ての試合の国名と選手名、得点時間を表示してください。オウンゴール（player_idがNULL）は表示しないでください。

SELECT
  c.name AS country_name,
  p.name AS player_name,
  g.goal_time
FROM goals g
JOIN players p ON g.player_id = p.id
JOIN pairings pa ON g.pairing_id = pa.id
JOIN countries c ON p.country_id = c.id
WHERE g.player_id IS NOT NULL;


-- 問23
-- 全ての試合のゴール時間と選手名を表示してください。左側外部結合を使用してオウンゴール（player_idがNULL）も表示してください。

SELECT
  g.goal_time,
  p.name
FROM goals g
LEFT JOIN players p
  ON g.player_id = p.id;

-- 問24
-- 全ての試合のゴール時間と選手名を表示してください。右側外部結合を使用してオウンゴール（player_idがNULL）も表示してください。

SELECT
  g.goal_time,
  p.name
FROM players p
RIGHT JOIN goals g
  ON g.player_id = p.id;

-- 問25
-- 全ての試合のゴール時間と選手名、国名を表示してください。また、オウンゴール（player_idがNULL）も表示してください。

SELECT
  g.goal_time,
  p.name AS player_name,
  c.name AS country_name
FROM goals g
LEFT JOIN players p ON g.player_id = p.id
LEFT JOIN countries c ON p.country_id = c.id;

-- 問26
-- 全てのゴール時間と得点を上げたプレイヤー名を表示してください。オウンゴールは表示しないでください。ただし、結合は使わずに副問合せを用いてください。

SELECT
  goal_time,
  (SELECT name
   FROM players p
   WHERE p.id = g.player_id) AS player_name
FROM goals g
WHERE player_id IS NOT NULL;

-- 問27
-- 各ポジションごと（GK、FWなど）に最も身長と、その選手名、所属クラブを表示してください。ただし、FROM句に副問合せを使用してください。

SELECT
  t.position,
  t.max_height,
  p.name,
  p.club
FROM (
  SELECT position, MAX(height) AS max_height
  FROM players
  GROUP BY position
) t
JOIN players p
  ON p.position = t.position
 AND p.height = t.max_height;

-- 問28
-- 各グループの最上位と最下位を表示し、その差が50より大きいグループを抽出してください。

SELECT
  group_name,
  MAX(ranking) AS max_rank,
  MIN(ranking) AS min_rank
FROM countries
GROUP BY group_name
HAVING MAX(ranking) - MIN(ranking) > 50;

-- 問29
-- 1980年生まれと、1981年生まれの選手が何人いるか調べてください。ただし、日付関数は使用せず、UNION句を使用してください。

SELECT '1980' AS birth_year, COUNT(*) AS cnt
FROM players
WHERE birth::text LIKE '1980%'
UNION
SELECT '1981', COUNT(*)
FROM players
WHERE birth::text LIKE '1981%';

-- 問30
-- 身長が195㎝より大きいか、体重が95kgより大きい選手を抽出してください。
-- ただし、以下の画像のように、どちらの条件にも合致する場合には2件分のデータとして抽出してください。また、結果はidの昇順としてください。

SELECT id, name, height, weight
FROM players
WHERE height > 195
UNION ALL
SELECT id, name, height, weight
FROM players
WHERE weight > 95
ORDER BY id;

-- 問31
-- 身長の高い選手6位～20位を抽出し、以下の項目を表示してください。
-- ※身長が同じ選手がいる場合、同じ身長の中でも名前の順番(昇順)に並び替えてください。
-- ・名前
-- ・身長
-- ・体重

SELECT name, height, weight
FROM (
  SELECT
    name,
    height,
    weight,
    ROW_NUMBER() OVER (
      ORDER BY height DESC, name ASC
    ) AS rn
  FROM players
) t
WHERE rn BETWEEN 6 AND 20;

-- 問32
-- グループCの各対戦毎にゴール数を表示してください。
-- ゴール数がゼロの場合も表示してください。副問合せは使わずに、外部結合だけを使用して下さい。
-- 表示するカラム
-- ・キックオフ日時
-- ・自国名
-- ・対戦相手国名
-- ・自国FIFAランク
-- ・対戦相手国FIFAランク
-- ・自国のゴール数
-- ソート順
-- ・キックオフ日時
-- ・自国FIFAランク

SELECT
  pa.kickoff,
  c1.name AS my_country,
  c2.name AS enemy_country,
  c1.ranking AS my_ranking,
  c2.ranking AS enemy_ranking,
  COUNT(p.id) AS my_goals
FROM pairings pa
JOIN countries c1 ON pa.my_country_id = c1.id
JOIN countries c2 ON pa.enemy_country_id = c2.id
LEFT JOIN goals g
  ON g.pairing_id = pa.id
LEFT JOIN players p
  ON g.player_id = p.id
 AND p.country_id = c1.id
WHERE c1.group_name = 'C'
GROUP BY
  pa.kickoff,
  c1.name,
  c2.name,
  c1.ranking,
  c2.ranking
ORDER BY
  pa.kickoff,
  c1.ranking;

-- 問33
-- グループCの各対戦毎にゴール数を表示してください。
-- ゴール数がゼロの場合も表示してください。自国のゴール数は副問合せを用いて表示してください。
-- 表示するカラム
-- ・キックオフ日時
-- ・自国名
-- ・対戦相手国名
-- ・自国FIFAランク
-- ・対戦相手国FIFAランク
-- ・自国のゴール数
-- ソート順
-- ・キックオフ日時
-- ・自国FIFAランク

SELECT
  pa.kickoff,
  c1.name AS my_country,
  c2.name AS enemy_country,
  c1.ranking AS my_ranking,
  c2.ranking AS enemy_ranking,
  (
    SELECT COUNT(*)
    FROM goals g
    JOIN players p ON g.player_id = p.id
    WHERE g.pairing_id = pa.id
      AND p.country_id = c1.id
  ) AS my_goals
FROM pairings pa
JOIN countries c1 ON pa.my_country_id = c1.id
JOIN countries c2 ON pa.enemy_country_id = c2.id
WHERE c1.group_name = 'C'
ORDER BY
  pa.kickoff,
  c1.ranking;


