CREATE TABLE IF NOT EXISTS movies (
    id            BIGSERIAL PRIMARY KEY,
    title         VARCHAR(255) NOT NULL,
    director      VARCHAR(255) NOT NULL,
    release_year  INTEGER NOT NULL,
    genre         VARCHAR(100),
    rating        INTEGER CHECK (rating >= 0 AND rating <= 100),
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_movies_title ON movies(title);