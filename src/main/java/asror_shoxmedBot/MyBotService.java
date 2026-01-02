package asror_shoxmedBot;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {

//        ================Kirish Qismi ==========================

    public SendMessage language(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu alekum ShoxMed botga Xush kelibsiz !!! 😊 \nTilni tanlang :");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbekcha");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDDFA\uD83C\uDDFF Ўзбекча");
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDDF7\uD83C\uDDFA Русский");
        row1.add(button2);
        rowList.add(row1);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDDEC\uD83C\uDDE7 English");
        row1.add(button3);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    //    ===================== O'zbekcha ============================


    public SendMessage ozbektili(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu bot Shox International Hospital xizmatlari haqida ma'lumot olishingizga yordam beradi.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCB3 'Shox Med' kartasi");
        row.add(button);
        rowList.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCDD Fikr-mulohaza \uD83D\uDC4D\uD83D\uDC4E");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDDFE Qabul");
        row2.add(button2);
        rowList.add(row2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("✅ Natijalar");
        row2.add(button3);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDE48 Shifokor yozuvini o'qib berish");
        row3.add(button4);
        rowList.add(row3);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDD0E Xizmatlarni qidirish (narx)");
        row3.add(button5);


        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCF2 Qo'ng'iroq buyurtma qilish");
        row4.add(button6);
        rowList.add(row4);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDE91 Tez yordamni chaqirish");
        row4.add(button7);


        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("☎\uFE0F Biz bilan bog'lanish");
        row5.add(button8);
        rowList.add(row5);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83D\uDCCD Bizning manzillarimiz");
        row5.add(button9);


        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("\uD83D\uDE9A\uD83D\uDD2C Ko'chib yuruvchi laboratoriya");
        row6.add(button10);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button11 = new KeyboardButton();
        button11.setText("\uD83C\uDDFA\uD83C\uDDFF Tilni o'zgartirish");
        row7.add(button11);
        rowList.add(row7);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //    =================Ўзбекча==================


    public SendMessage kriltili(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ушбу бот Shox International Hospital хизматлари ҳақида маьлумот олишингизга ёрдам беради.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCB3 'Shox Med' картаси");
        row.add(button);
        rowList.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCDD Фикр-мулоҳаза \uD83D\uDC4D\uD83D\uDC4E");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDDFE Қабул");
        row2.add(button2);
        rowList.add(row2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("✅ Натижалар");
        row2.add(button3);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDE48 Шифокор ёзувини ўқиб бериш");
        row3.add(button4);
        rowList.add(row3);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDD0E Хизматларни қидириш (нарх)");
        row3.add(button5);


        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCF2 Қўнғироқ буюртма қилиш");
        row4.add(button6);
        rowList.add(row4);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDE91 Тез ёрдамни чақириш");
        row4.add(button7);


        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("☎\uFE0F Биз билан боғланиш");
        row5.add(button8);
        rowList.add(row5);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83D\uDCCD Бизнинг манзилларимиз");
        row5.add(button9);


        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("\uD83D\uDE9A\uD83D\uDD2C Кўчиб юрувчи лаборатория");
        row6.add(button10);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button11 = new KeyboardButton();
        button11.setText("\uD83C\uDDFA\uD83C\uDDFF Тилни ўзгартириш");
        row7.add(button11);
        rowList.add(row7);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    //    ================== Русский ===============================

    public SendMessage rustili(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Этот бот поможет вам получить информацию об услугах Shox International Hospital.");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCB3 Накопительный карта 'Shox Med'");
        row.add(button);
        rowList.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCDD Отзыв \uD83D\uDC4D\uD83D\uDC4E");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDDFE Запись");
        row2.add(button2);
        rowList.add(row2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("✅ Результаты");
        row2.add(button3);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDE48 Разбор почерка направления");
        row3.add(button4);
        rowList.add(row3);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDD0E Поиск услуг (цены)");
        row3.add(button5);


        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCF2 Перезвонить мне");
        row4.add(button6);
        rowList.add(row4);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDE91 Вызвать скорую");
        row4.add(button7);


        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("☎\uFE0F Наши контакты");
        row5.add(button8);
        rowList.add(row5);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83D\uDCCD Наши локации");
        row5.add(button9);


        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("\uD83D\uDE9A\uD83D\uDD2C Выездная лаборатория");
        row6.add(button10);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button11 = new KeyboardButton();
        button11.setText("\uD83C\uDDF7\uD83C\uDDFA Сменить язык");
        row7.add(button11);
        rowList.add(row7);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //    ===================== English ======================

    public SendMessage ingliztili(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("This bot helps you to get information about services of Shox International Hospital");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCB3 'Shox Med' discount card");
        row.add(button);
        rowList.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCDD Feedback \uD83D\uDC4D\uD83D\uDC4E");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDDFE Appointment");
        row2.add(button2);
        rowList.add(row2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("✅ Results");
        row2.add(button3);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDE48 Decode doctor's handwritings");
        row3.add(button4);
        rowList.add(row3);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDD0E Search for services (price)");
        row3.add(button5);


        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCF2 Request a call");
        row4.add(button6);
        rowList.add(row4);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDE91 Call an ambulance");
        row4.add(button7);


        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("☎\uFE0F Our contacts");
        row5.add(button8);
        rowList.add(row5);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83D\uDCCD Our locations");
        row5.add(button9);


        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("\uD83D\uDE9A\uD83D\uDD2C Mobile Laboratory");
        row6.add(button10);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button11 = new KeyboardButton();
        button11.setText("\uD83C\uDDEC\uD83C\uDDE7 Change Language");
        row7.add(button11);
        rowList.add(row7);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

// =============== Fikr-mulohaza bosilganda <O'zbekcha> ======================

    public SendMessage fikrmulohazabosilgandaUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    // =============== Fikr-mulohaza bosilganda <Ўзбекча> ======================

    public SendMessage fikrmulohazabosilgandaKril(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Илтимос телефон рақамингизни юборинг (Намуна: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText(" \uD83D\uDCF2 Мeнинг ракамимни юбуруш");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Бекор қилиш");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


    // =============== Fikr-mulohaza bosilganda <Русский> ======================

    public SendMessage fikrmulohazabosilgandaRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Пожалуйста, укажите свой номер телефона (Образец: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Отправь мой номер");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Отменить");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    // =============== Fikr-mulohaza bosilganda <English> ======================

    public SendMessage fikrmulohazabosilgandaEnglish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Please provide your phone number (e.g. +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Send my phone number");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Cancel");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

//        ====================== Results bosilganda Uzbekcha ==============

    public SendMessage resultsUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Namunada ko'rsatilgandek ID va Parol ni kiriting.  ID bo'sh joy Parol. \n" +
                "\n" +
                "Namuna: 123456 ABCD12");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("❌ Bekor qilish");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== Results bosilganda Ўзбекча ==============

    public SendMessage resultsKril(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Намунада кўрсатилгандек ИД ва Парол ни киритинг. ИД бўш жой Парол \n" +
                "\n" +
                "Намуна: 123456 ABCD12");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("❌ Бекор қилиш");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== Results bosilganda Ruskiy ==============


    public SendMessage resultsRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Введите ID и Пароль как указано в примере.  ID пробел Пароль. \n" +
                "\n" +
                "Пример: 123456 ABCD12");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("❌ Отменить");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== Results bosilganda English ==============

    public SendMessage resultsEnglish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Enter ID and Password as shown in the example.  ID empty space Password. \n" +
                "\n" +
                "Example: 123456 ABCD12");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("❌ Cancel");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== 🙈 Shifokor yozuvini o'qib berish bosilganda <Uzbek> ==============

    public SendMessage shifokoryozuviniuqishUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== 🙈 Shifokor yozuvini o'qib berish bosilganda <Kril> ==============

    public SendMessage shifokoryozuviniuqishKril(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Илтимос телефон рақамингизни юборинг (Намуна: +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Мeнинг ракамимни юбуруш");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Бекор қилиш");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


    //        ====================== 🙈 Shifokor yozuvini o'qib berish bosilganda <Rus Tili> ==============

    public SendMessage shifokoryozuviniuqishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Пожалуйста, укажите свой номер телефона (Образец: +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Отправь мой номер");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Отменить");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== 🙈 Shifokor yozuvini o'qib berish bosilganda <English Tili> ==============

    public SendMessage shifokoryozuviniuqishEnglish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Please provide your phone number (e.g. +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Send my phone number");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Cancel");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


    //        ====================== 📲 Qo'ng'iroq buyurtma qilish bosilganda <Uzbek> ==============

    public SendMessage qungiroqbuyurtmaqilishUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== 📲 Qo'ng'iroq buyurtma qilish <Kril> ==============

    public SendMessage qungiroqbuyurtmaqilishKril(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Илтимос телефон рақамингизни юборинг (Намуна: +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Мeнинг ракамимни юбуруш");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Бекор қилиш");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


    //        ====================== 📲 Qo'ng'iroq buyurtma qilish <Rus Tili> ==============

    public SendMessage qungiroqbuyurtmaqilishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Пожалуйста, укажите свой номер телефона (Образец: +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Отправь мой номер");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Отменить");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //        ====================== 📲 Qo'ng'iroq buyurtma qilish<English Tili> ==============

    public SendMessage qungiroqbuyurtmaqilishEnglish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Please provide your phone number (e.g. +998999999999) \uD83D\uDCF2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Send my phone number");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Cancel");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

//    ================= ☎️ Biz bilan bog'lanish bosilganda <Uzbek> ====================

    public SendMessage boglanishUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        sendMessage.setText("✅ SHOX MED CENTER\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Mirobod tumani, Oybek ko'chasi, 34\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 202-02-12\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX INTERNATIONAL HOSPITAL\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Yakkasaroy tumani, Kichik Xalqa Yo'li ko'chasi, 70a\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-00-17\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ MED ZDOROVAYA SEMYA CENTER\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Chilonzor tumani 11-kvarta, Maqsud Shayx-Zoda ko'chasi, 31A\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-10-51\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX MED PEDIATRIYA\n" +
                "\uD83D\uDCCD Manzil: Toshkent 4-oʻtish Xushnava, 26/2\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 519-11-83\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX MED REABILITATSIYA\n" +
                "\uD83D\uDCCD Manzil: Chashtepiskaya 9-tupik ko'chasi, 45.\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 512-11-83\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON\n" +
                "\uD83D\uDCCD Manzil: Andijon shahri, Y. Otabek ko‘chasi 5\n" +
                "Mo‘ljal: Onkologiya va Ruhiy kasalliklar shifoxonasi ortasida \n" +
                "Yo‘nalish: 222 va 33 damas (yo‘nalish oxiri)\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 201-03-00\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON MIKRORAYON\n" +
                "\uD83D\uDCCD Manzil: Andijon shahri, 2-mikrorayon\n" +
                "Mo‘ljal: Evos kafesi yonida\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 202-03-00\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER FILIAL\n" +
                "\uD83D\uDCCD Manzil: Shaxrihon tumani 5 yulduz\n" +
                "Muljal Shaxrihon 5 yulduz shifohonasi\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (93) 811-68-18\n" +
                "\n" +
                "⏱ Ish vaqtlari: 07:00 - 16:00.");


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //    ================= ☎️ Biz bilan bog'lanish bosilganda <Kril> ====================

    public SendMessage boglanishKril(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        sendMessage.setText("✅ SHOX MED CENTER\n" +
                "\uD83D\uDCCD Манзил: Тошкент шаҳар, Миробод тумани, Ойбек кўчаси, 34\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (71) 202-02-12\n" +
                "\n" +
                "⏱ Иш вақтлари: 24/7.\n" +
                "\n" +
                "✅ SHOX INTERNATIONAL HOSPITAL\n" +
                "\uD83D\uDCCD Манзил: Тошкент шаҳар, Яккасарой тумани, Кичик Халқа Йўли кўчаси, 70а\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-00-17\n" +
                "\n" +
                "⏱ Иш вақтлари: 24/7.\n" +
                "\n" +
                "✅ MED ZDOROVAYA SEMYA CENTER\n" +
                "\uD83D\uDCCD Манзил: Тошкент шаҳар, Чилонзор тумани 11-кварта, Мақсуд Шайх-Зода кўчаси, 31A\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-10-51\n" +
                "\n" +
                "⏱ Иш вақтлари: 24/7.\n" +
                "\n" +
                "✅ SHOX MED PEDIATRIYA\n" +
                "\uD83D\uDCCD Манзил: Тошкент 4-ўтиш Хушнава, 26/2\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (55) 519-11-83\n" +
                "\n" +
                "⏱ Иш вақтлари: 24/7.\n" +
                "\n" +
                "✅ SHOX MED REABILITATSIYA\n" +
                "\uD83D\uDCCD Манзил: Чаштепиская 9-тупик кўчаси, 45.\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (55) 512-11-83\n" +
                "\n" +
                "⏱ Иш вақтлари: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON\n" +
                "\uD83D\uDCCD Манзил: Андижон шаҳри, Й. Отабек кўчаси 5\n" +
                "Мўлжал: Онкология ва Руҳий касалликлар шифохонаси ортасида \n" +
                "Йўналиш: 222 ва 33 дамас (йўналиш охири)\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (55) 201-03-00\n" +
                "\n" +
                "⏱ Иш вақтлари: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON MIKRORAYON\n" +
                "\uD83D\uDCCD Манзил: Андижон шаҳри, 2-микрорайон\n" +
                "Мўлжал: Эвос кафеси ёнида\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (55) 202-03-00\n" +
                "\n" +
                "⏱ Иш вақтлари: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER FILIAL\n" +
                "\uD83D\uDCCD Манзил: Шахриҳон тумани 5 юлдуз\n" +
                "Мулжал Шахриҳон 5 юлдуз шифоҳонаси\n" +
                "\n" +
                "☎\uFE0F Телефон рақам:\n" +
                " Call center: 1183\n" +
                " +998 (93) 811-68-18\n" +
                "\n" +
                "⏱ Иш вақтлари: 07:00 - 16:00.");

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }


    //    ================= ☎️ Biz bilan bog'lanish bosilganda <Rus tili> ====================

    public SendMessage boglanishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        sendMessage.setText("✅ SHOX MED CENTER\n" +
                "\uD83D\uDCCD Адрес: Город Ташкент, Мирабадский район, ул. Ойбека, д. 34\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (71) 202-02-12\n" +
                "\n" +
                "⏱ Рабочее время: 24/7.\n" +
                "\n" +
                "✅ SHOX INTERNATIONAL HOSPITAL\n" +
                "\uD83D\uDCCD Адрес: Город Ташкент, Яккасарайский район, ул. Кичик Халка Йули, д. 70а\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-00-17\n" +
                "\n" +
                "⏱ Рабочее время: 24/7.\n" +
                "\n" +
                "✅ MED ZDOROVAYA SEMYA CENTER\n" +
                "\uD83D\uDCCD Адрес: Город Ташкент, Чиланзар 11 квартал, улица Максуда Шейх-Заде, дом 31А\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-10-51\n" +
                "\n" +
                "⏱ Рабочее время: 24/7.\n" +
                "\n" +
                "✅ SHOX MED PEDIATRIYA\n" +
                "\uD83D\uDCCD Адрес: г. Ташкент 4-й проезд Хушнаво, 26/2\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (55) 519-11-83\n" +
                "\n" +
                "⏱ Рабочее время: 24/7.\n" +
                "\n" +
                "✅ SHOX MED REABILITATSIYA\n" +
                "\uD83D\uDCCD Адрес: Чаштепиская 9-й тупик, 45.\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (55) 512-11-83\n" +
                "\n" +
                "⏱ Рабочее время: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON\n" +
                "\uD83D\uDCCD Адрес: г. Андижан, ул. Ы. Отабека, 5\n" +
                "Ориентир: Между онкологической и психиатрической больницами\n" +
                "Маршрут: 222 и 33 дама (конец маршрута)\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (55) 201-03-00\n" +
                "\n" +
                "⏱ Рабочее время: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON MIKRORAYON\n" +
                "\uD83D\uDCCD Адрес: г. Андижан, 2-й микрорайон\n" +
                "Ориентир: рядом с кафе «Эвос»\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (55) 202-03-00\n" +
                "\n" +
                "⏱ Рабочее время: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER FILIAL\n" +
                "\uD83D\uDCCD Адрес: Шахриханский район 5 звезд\n" +
                "Мулджал Шахрихан 5 звездная больница\n" +
                "\n" +
                "☎\uFE0F Телефонный номер:\n" +
                " Call center: 1183\n" +
                " +998 (93) 811-68-18\n" +
                "\n" +
                "⏱ Рабочее время: 07:00 - 16:00.");

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    //    ================= ☎️ Biz bilan bog'lanish bosilganda <English tili> ====================

    public SendMessage boglanishEnglish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        sendMessage.setText("✅ SHOX MED CENTER\n" +
                "\uD83D\uDCCD Address: Tashkent city, Mirabad district, Oybek street, 34\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (71) 202-02-12\n" +
                "\n" +
                "⏱ Working hours: 24/7.\n" +
                "\n" +
                "✅ SHOX INTERNATIONAL HOSPITAL\n" +
                "\uD83D\uDCCD Address: Tashkent city, Yakkasaray district, Kichik Halqa Yuli street, 70a\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-00-17\n" +
                "\n" +
                "⏱ Working hours: 24/7.\n" +
                "\n" +
                "✅ MED ZDOROVAYA SEMYA CENTER\n" +
                "\uD83D\uDCCD Address: Tashkent city, Chilanzar 11-district, Maqsud Sheyh-Zada street, 31A\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-10-51\n" +
                "\n" +
                "⏱ Working hours: 24/7.\n" +
                "\n" +
                "✅ SHOX MED PEDIATRIYA\n" +
                "\uD83D\uDCCD Address: Tashkent 4th passage Khushnava, 26/2\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (55) 519-11-83\n" +
                "\n" +
                "⏱ Working hours: 24/7.\n" +
                "\n" +
                "✅ SHOX MED REABILITATSIYA\n" +
                "\uD83D\uDCCD Address: Chashtepiskaya 9th dead end, 45.\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (55) 512-11-83\n" +
                "\n" +
                "⏱ Working hours: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON\n" +
                "\uD83D\uDCCD Address: Andijan city, Y. Otabek street 5\n" +
                "Landmark: Between Oncology and Psychiatric Hospital \n" +
                "Route: 222 and 33 damas (end of route)\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (55) 201-03-00\n" +
                "\n" +
                "⏱ Working hours: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER ANDIJON MIKRORAYON\n" +
                "\uD83D\uDCCD Address: Andijan city, 2nd microdistrict\n" +
                "Landmark: Next to Evos cafe\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (55) 202-03-00\n" +
                "\n" +
                "⏱ Working hours: 24/7.\n" +
                "\n" +
                "✅ SHOX MED CENTER FILIAL\n" +
                "\uD83D\uDCCD Address: Shahrikhan district 5 stars\n" +
                "Muljal Shahrikhan 5 star hospital\n" +
                "\n" +
                "☎\uFE0F Phone number:\n" +
                " Call center: 1183\n" +
                " +998 (93) 811-68-18\n" +
                "\n" +
                "⏱ Working hours: 07:00 - 16:00.");

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

//    ====================== 📍 Bizning manzillarimiz bosilganda <Uzbek> =======================

    public SendMessage mahalllaUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos filialni tanlang:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("SHOX MED CENTER");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("SHOX INTERNATIONAL HOSPITAL");
        row.add(button1);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("MED ZDOROVAYA SEMYA CENTER");
        row1.add(button2);
        rowList.add(row1);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("SHOX MED PEDIATRIYA");
        row1.add(button3);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("SHOX MED REABILITATSIYA");
        row2.add(button4);
        rowList.add(row2);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("SHOX MED CENTER ANDIJON");
        row2.add(button5);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("SHOX MED CENTER ANDIJON MIKRORAYON");
        row3.add(button6);
        rowList.add(row3);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("SHOX MED CENTER FILIAL");
        row3.add(button7);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0F Qaytish");
        row4.add(button8);
        rowList.add(row4);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }


    //    ====================== 📍 Bizning manzillarimiz bosilganda <Kril tili> =======================

    public SendMessage mahalllaKril(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Илтимос филиални танланг:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("SHOX MED CENTER");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("SHOX INTERNATIONAL HOSPITAL");
        row.add(button1);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("MED ZDOROVAYA SEMYA CENTER");
        row1.add(button2);
        rowList.add(row1);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("SHOX MED PEDIATRIYA");
        row1.add(button3);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("SHOX MED REABILITATSIYA");
        row2.add(button4);
        rowList.add(row2);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("SHOX MED CENTER ANDIJON");
        row2.add(button5);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("SHOX MED CENTER ANDIJON MIKRORAYON");
        row3.add(button6);
        rowList.add(row3);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("SHOX MED CENTER FILIAL");
        row3.add(button7);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0F Қайтиш");
        row4.add(button8);
        rowList.add(row4);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    //    ====================== 📍 Bizning manzillarimiz bosilganda <Rus tili> =======================

    public SendMessage mahalllaRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите филиал:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("SHOX MED CENTER");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("SHOX INTERNATIONAL HOSPITAL");
        row.add(button1);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("MED ZDOROVAYA SEMYA CENTER");
        row1.add(button2);
        rowList.add(row1);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("SHOX MED PEDIATRIYA");
        row1.add(button3);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("SHOX MED REABILITATSIYA");
        row2.add(button4);
        rowList.add(row2);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("SHOX MED CENTER ANDIJON");
        row2.add(button5);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("SHOX MED CENTER ANDIJON MIKRORAYON");
        row3.add(button6);
        rowList.add(row3);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("SHOX MED CENTER FILIAL");
        row3.add(button7);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0F Вернуться");
        row4.add(button8);
        rowList.add(row4);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }


    //    ====================== 📍 Bizning manzillarimiz bosilganda <English tili> =======================

    public SendMessage mahalllaEnglish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Please select a branch:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("SHOX MED CENTER");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("SHOX INTERNATIONAL HOSPITAL");
        row.add(button1);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("MED ZDOROVAYA SEMYA CENTER");
        row1.add(button2);
        rowList.add(row1);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("SHOX MED PEDIATRIYA");
        row1.add(button3);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("SHOX MED REABILITATSIYA");
        row2.add(button4);
        rowList.add(row2);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("SHOX MED CENTER ANDIJON");
        row2.add(button5);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("SHOX MED CENTER ANDIJON MIKRORAYON");
        row3.add(button6);
        rowList.add(row3);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("SHOX MED CENTER FILIAL");
        row3.add(button7);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0F Back");
        row4.add(button8);
        rowList.add(row4);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

//    ================== SHOX MED CENTER bosilganda <Uzbek tili> ================

    public SendLocation location1Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.291756);
        sendLocation.setLongitude(69.279848);
        return sendLocation;

    }

    public SendMessage locationMessage1Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX MED CENTER\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Mirobod tumani, Oybek ko'chasi, 34\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 202-02-12\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 24/7.");
        return sendMessage;
    }

    public SendLocation location2Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.269244);
        sendLocation.setLongitude(69.263088);
        return sendLocation;
    }

    public SendMessage locationMessage2Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX INTERNATIONAL HOSPITAL\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Yakkasaroy tumani, Kichik Xalqa Yo'li ko'chasi, 70a\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-00-17\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 24/7.");
        return sendMessage;
    }

    public SendLocation location3Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.278998);
        sendLocation.setLongitude(69.187926);
        return sendLocation;
    }

    public SendMessage locationMessage3Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ MED ZDOROVAYA SEMYA CENTER\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Chilonzor tumani 11-kvarta, Maqsud Shayx-Zoda ko'chasi, 31A\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-10-51\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.");
        return sendMessage;
    }

    public SendLocation location4Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.358741);
        sendLocation.setLongitude(69.289449);
        return sendLocation;
    }

    public SendMessage locationMessage4Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX MED PEDIATRIYA\n" +
                "\uD83D\uDCCD Manzil: Toshkent 4-oʻtish Xushnava, 26/2\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 519-11-83\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.");
        return sendMessage;
    }

    public SendLocation location5Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.23985);
        sendLocation.setLongitude(69.200037);
        return sendLocation;
    }

    public SendMessage locationMessage5Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX MED REABILITATSIYA\n" +
                "\uD83D\uDCCD Manzil: Chashtepiskaya 9-tupik ko'chasi, 45.\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 512-11-83\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 24/7.");
        return sendMessage;
    }

    public SendLocation location6Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(40.811812);
        sendLocation.setLongitude(72.3177462);
        return sendLocation;
    }

    public SendMessage locationMessage6Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX MED CENTER ANDIJON\n" +
                "\uD83D\uDCCD Manzil: Andijon shahri, Y. Otabek ko‘chasi 5\n" +
                "Mo‘ljal: Onkologiya va Ruhiy kasalliklar shifoxonasi ortasida \n" +
                "Yo‘nalish: 222 va 33 damas (yo‘nalish oxiri)\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 201-03-00\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.");
        return sendMessage;
    }

    public SendLocation location7Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(40.748716);
        sendLocation.setLongitude(72.345998);
        return sendLocation;
    }

    public SendMessage locationMessage7Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX MED CENTER ANDIJON MIKRORAYON\n" +
                "\uD83D\uDCCD Manzil: Andijon shahri, 2-mikrorayon\n" +
                "Mo‘ljal: Evos kafesi yonida\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 202-03-00\n" +
                "\n" +
                "⏱ Ish vaqtlari: 24/7.");
        return sendMessage;
    }

    public SendMessage nimadyr(Long chnatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chnatId);
        sendMessage.setText("Assalomu akeykum");
        return sendMessage;
    }

    public SendLocation location8Uzb(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(40.693569);
        sendLocation.setLongitude(72.063849);
        return sendLocation;
    }

    public SendMessage locationMessage8Uzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX MED CENTER FILIAL\n" +
                "\uD83D\uDCCD Manzil: Shaxrihon tumani 5 yulduz\n" +
                "Muljal Shaxrihon 5 yulduz shifohonasi\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (93) 811-68-18\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 07:00 - 16:00.");
        return sendMessage;
    }


}
