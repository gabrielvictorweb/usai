FROM node:18-alpine

WORKDIR /app 

ENV NODE_ENV=production

LABEL maintainer="risa"

COPY ./gui .

EXPOSE 3000

RUN npm install

CMD npm start
