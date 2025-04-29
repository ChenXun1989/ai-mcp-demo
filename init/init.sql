
# 建表
CREATE TABLE user_scores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    subject VARCHAR(255) NOT NULL,
    score DECIMAL(5, 2) NOT NULL
);

-- 插入数据
INSERT INTO user_scores (name, subject, score) VALUES
('张三', '数学', 90),
('张三', '英语', 85),
('张三', '历史', 92),
('李四', '数学', 88),
('李四', '英语', 90),
('王五', '历史', 95);
