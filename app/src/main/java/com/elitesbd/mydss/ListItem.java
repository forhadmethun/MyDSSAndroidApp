package com.elitesbd.mydss;

import com.elitesbd.mydss.fragment.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forhad on 20-10-2016.
 */

public class ListItem {

    static String[] title = {"১.দারিদ্র্য নিরসন কর্মসূচি","২. সামাজিক নিরাপত্তা কর্মসূচি","৩. প্রতিবন্ধীবিষয়ক কর্মসূচি","৪.১ শিশু (কিশোর-কিশোরী) উন্নয়ন কেন্দ্র","৫. শিশু বিষয়ক কর্মসূচি","৬. নারীদের দক্ষতা উন্নয়ন প্রশিক্ষণ"};
    static String[] body = {"সমাজসেবা অধিদফতর পরিচালিত দারিদ্র্য নিরসন কর্মসূচিসমূহ হল:\n" +
            "১.১ পল্লী সমাজসেবা (আরএসএস) কার্যক্রম\n" +
            "জাতির জনক বঙ্গবন্ধু শেখ মুজিবুর রহমানের নির্দেশনায় সমাজসেবা অধিদফতরের মাধ্যমে ১৯৭৪ সনে পরীক্ষামূলকভাবে তৎকালীন ১৯টি থানায় ‘পল্লী সমাজসেবা কার্যক্রম’এর যাত্রা শুরম্ন হয়। এর সফলতার ধারাবাহিকতায় এ কর্মসূচি বাংলাদেশের প্রামিত্মক জনগোষ্ঠীর অর্থনৈতিক মুক্তির ক্ষেত্রে সূচনা করে এক যুগামত্মকারী ইতিহাস।\n" +
            "এ কর্মসূচির মাধ্যমে পল্লী অঞ্চলে বসবাসরত ভূমিহীন, দারিদ্র্যসীমার নিচে বসবাসরত জনগোষ্ঠীর মধ্যে সামাজিক সচেতনতা সৃষ্টি করে বিভিন্ন কর্মদলে সংগঠিত করা হয়ে থাকে এবং সুদমুক্ত ক্ষুদ্র পুঁজি প্রদানের মাধ্যমে উৎপাদনমূলক ও আয়বর্ধ্বক কর্মসূচিতে সম্পৃক্ত করে দেশের সকল ধরনের অর্থনৈতিক উন্নয়ন কর্মসূচিতে তাদের অংশগ্রহণ নিশ্চিত করা হচ্ছে।\n" +
            " \n" +
            "১.২ পল্লী মাতৃকেন্দ্র (আরএমসি)\n" +
            "এ কর্মসূচির মূল লক্ষ্য হচ্ছে গ্রামের দরিদ্র নারীদের ছোট পরিবার গঠনের উপকারিতা, বয়স্ক শিক্ষা, স্বাস্থ্য ও পুষ্টি, মা ও শিশুযত্ন সম্পর্কে অবহিত এবং উদ্বুদ্ধকরণের পাশাপাশি দরিদ্রতম জনগোষ্ঠীর অর্থনৈতিক উন্নয়নের লক্ষ্যেক্ষুদ্রঋণ প্রদান, সঞ্চয় সৃষ্টি ও অর্থকরী লাভজনক কর্মকা--র মাধ্যমে আয় বৃদ্ধির ব্যবস্থা করা।\n" +
            "১.৩ দগ্ধ ও প্রতিবন্ধী ব্যক্তিদের পুনর্বাসন কার্যক্রম\n" +
            "এ কর্মসূচির মাধ্যমে দগ্ধ ব্যক্তিদের দ্রম্নত চিকিৎসার ব্যবস্থা নিশ্চিতসহ কার্যক্রম এলাকায় জরিপের মাধ্যমে দগ্ধ ও প্রতিবন্ধী ব্যক্তিদের সংখ্যা যথাযথভাবে নিরূপণ করা হয়। এ ছাড়া দগ্ধ ও প্রতিবন্ধী ব্যক্তিদের কর্মসংস্থানের সুযোগ সৃষ্টির লক্ষ্যেতাদের দক্ষতাভিত্তিক পেশা অথবা ব্যক্তি যে কাজে অভিজ্ঞ ও পারদর্শী সে কাজের জন্য তাকে অথবা তার পরিবারকে ক্ষুদ্রঋণ সহায়তা প্রদান করাই এ কর্মসূচির উদ্দেশ্য।\n" +
            "১.৪ শহর সমাজসেবা (ইউসিডি) কার্যক্রম\n" +
            "শহর এলাকায় বসবাসরত স্বল্প আয়ের দরিদ্র জনগোষ্ঠীর আত্ম-কর্মসংস্থানের সুযোগ সৃষ্টি, প্রশিক্ষণের মাধ্যমে দক্ষতা বৃদ্ধি, আয় বৃদ্ধি ও কর্মসংস্থানের জন্য ক্ষুদ্রঋণ কার্যক্রম গ্রহণ এবং সামাজিক উন্নয়নমূলক কর্মকা-- নিয়োজিত বিভিন্ন স্বেচ্ছাসেবী সংগঠনকে সহায়তা প্রদানই এ কার্যক্রমের উদ্দেশ্য।\n" +
            "১.৫ আশ্রয়ণ প্রকল্প\n" +
            "আশ্রয়ণ প্রকল্পটি সরকারের অন্যতম অগ্রাধিকার কর্মসূচি। গ্রামে বসবাসকারী দরিদ্র জনগোষ্ঠী, ভূমিহীন, গৃহহীন, ছিন্নমূল ও দুর্দশাগ্রসত্ম পরিবারকে পুনর্বাসন এবং তাদের শিক্ষা, চিকিৎসা, প্রশিক্ষণ ও ক্ষুদ্রঋণ প্রদানের মাধ্যমে আত্মনির্ভরশীল করে তোলার জন্য সমাজসেবা অধিদফতর কর্তৃক বর্তমানে দেশের ৫৭টি জেলার ১৮১টি উপজেলায় আশ্রয়ণ প্রকল্প বাসত্মবায়িত হচ্ছে।\n","সামাজিক নিরাপত্তা কর্মসূচির আওতায় সমাজকল্যাণ মন্ত্রণালয়ের মাধ্যমে প্রামিত্মক জনগোষ্ঠীর অধিকার সংরক্ষণ ও জীবনমান উন্নয়নে বর্তমান সরকার গ্রহণ করেছে বহুমুখী কর্মসূচি। তাদের জন্য গ্রহণ করা হয়েছে প্রশিক্ষণ ও পুনর্বাসন কর্মসূচি, অক্ষম ব্যক্তিদের জন্য ভাতা প্রদান কর্মসূচি এবং স্কুলগামী প্রতিবন্ধী শিক্ষার্থীর জন্য শিক্ষা উপবৃত্তি কর্মসূচি।\n" +
            "২.১ বয়স্ক ভাতা   \n" +
            "দুঃস্থহ ও স্বল্প উপার্জনক্ষম অথবা উপার্জনে অক্ষম প্রবীণ জনগোষ্ঠীর সামাজিক নিরাপত্তা বিধান এবং পরিবার ও সমাজে মর্যাদা বৃদ্ধির লক্ষ্যে১৯৯৭-৯৮ অর্থ বছরে  ‘বয়স্কভাতা’ কর্মসূচি প্রবর্তন করা হয়। প্রাথমিকভাবে দরিদ্র প্রবীণ ব্যক্তিকে প্রতিমাসে ১০০ টাকা হারে ভাতা প্রদানের আওতায় আনা হয়। ২০১৬-১৭ অর্থবছরে জনপ্রতি মাসিক ভাতার হার ৪০০ টাকা হতে ৫০০ টাকায় উন্নীত করা হয়েছে।\n" +
            "২.২ বিধবা ও স্বামী নিগৃহিতা মহিলাদের ভাতা প্রদান কর্মসূচি\n" +
            "১৯৯৮-৯৯ অর্থ বছরে সমাজসেবা অধিদফতররের মাধ্যমে বিধবা ও স্বামী নিগৃহিতা মহিলাদের ভাতা কর্মসূচি প্রবর্তন করা হয়। ঐ অর্থ বছরে ৪ লক্ষ ৩ হাজার ১১০ জনকে মাসিক ১০০ টাকা হারে  ভাতা প্রদান করা হয়।২০১৬-১৭ অর্থবছরে জনপ্রতি মাসিক ভাতার হার ৪০০ টাকা হতে ৫০০ টাকায় উন্নীত করা হয়েছে।\n" +
            " \n" +
            "বয়স্ক ও বিধবা ভাতা কার্যক্রমে সরকারের আরেকটি উলেস্নখযোগ্য সাফল্য হলো সকল ভাতাভোগীর নামে ১০ টাকার বিনিময়ে ব্যাংক হিসাব খুলে ভাতা প্রদান। এর ফলে ভাতাভোগীগণকে কোনোরকম হয়রানির শিকার হতে হয়না।\n" +
            "২.৩ অসচ্ছল প্রতিবন্ধী ভাতা\n" +
            "সংবিধানের ১৫(ঘ) অনুচ্ছেদ দায়-দায়িত্বের অংশ হিসেবে ২০০৫-০৬ অর্থ বছরে অসচ্ছল প্রতিবন্ধী ভাতা কর্মসূচি প্রবর্তন করা হয়। শুরম্নতে ১,০৪,১৬৬ জন প্রতিবন্ধী ব্যক্তিকে জনপ্রতি মাসিক ২০০ টাকা হারে ভাতা প্রদানের আওতায় আনা হয়।\n" +
            "১০ টাকার বিনিময়ে সকল ভাতাভোগীর নিজ নামে ব্যাংক হিসাব খুলে ভাতার অর্থ পরিশোধ করা হচ্ছে।\n" +
            "২.৪ প্রতিবন্ধী শিক্ষার্থীদের জন্য শিক্ষা উপবৃত্তি\n" +
            "প্রতিবন্ধী জনগোষ্ঠীর সাংবিধানিক অধিকার প্রতিষ্ঠা  এবং দরিদ্র, অসহায়, সুবিধাবঞ্চিত প্রতিবন্ধী শিশুকিশোরদের শিক্ষা লাভের সহায়তা হিসেবে ২০০৭-০৮ অর্থ বছর থেকে প্রতিবন্ধী শিক্ষার্থীদের জন্য শিক্ষা উপবৃত্তি কর্মসূচি প্রবর্তন করা হয়েছে। এ কর্মসূচির আওতায় মাসিক উপবৃত্তি প্রাথমিক সত্মরে, মাধ্যমিক সত্মরে, উচ্চ মাধ্যমিক সত্মরে এবং উচ্চতর সত্মরে প্রদান করা হয়।\n" +
            "২.৫ ভিক্ষাবৃত্তিতে নিয়োজিত জনগোষ্ঠীর পুনর্বাসন ও বিকল্প কর্মসংস্থান শীর্ষক কর্মসূচি\n" +
            "এর মূল লক্ষ্য হল ভিক্ষাবৃত্তিতে নিয়োজিত  জনগোষ্ঠীকে পুনর্বাসন  ও কারিগরী  প্রশিক্ষণের মাধ্যমে তাদেরকে আয়বর্ধক কর্মকান্ডে সম্পৃক্ত করা। পরোক্ষভাবে ভিক্ষুকদের পরিবারকে সহায়তা প্রদান এবং সর্বোপরি সমাজ ও রাষ্ট্রের কল্যাণ সাধন।\n","বাংলাদেশের ঢাকা, খুলনা, চট্টগ্রাম ও রাজশাহী এ চারটি বিভাগে ১৯৬২ সন থেকে সমাজসেবা অধিদফতরাধীন ৪টি শারীরিক প্রবিতন্ধীদের প্রশিক্ষণ (Physicaly Handicapped Training Centre-PHTC)কেন্দ্রের অভ্যমত্মরে ৪টি দৃষ্টিপ্রতিবন্ধী বিদ্যালয় রয়েছে। এ ছাড়া ১৯৬৪ সনে বরিশালে একটি দৃষ্টিপ্রতিবন্ধী বিদ্যালয় স্থাপিত হয়। বর্তমানে সারা দেশে পরিচালিত ৫টি দৃষ্টিপ্রতিবন্ধী বিদ্যালয়ের আসন সংখ্যা ৩৪০টি।\n" +
            "সেবাসমূহ :\n" +
            " \n" +
            "·                    সাধারণ শিক্ষা;\n" +
            "·                    আবাসিক ও অনাবাসিক সুবিধা;\n" +
            "·                    আবাসিক শিক্ষার্থীদের জন্য বিনামূল্যে ভরণ-পোষণ, চিকিৎসাসেবা, খেলাধুলা, চিত্তবিনোদন;\n" +
            "·                    ব্রেইল পদ্ধতিতে শিক্ষা দান এবং বিনামূল্যে ব্রেইল পুসত্মক সরবরাহ;\n" +
            "·                    সহায়ক শিক্ষা উপকরণ সরবরাহ; এবং\n" +
            "·                    পুনর্বাসন।\n" +
            " \n" +
            " \n" +
            "৩.২ বাক-শ্রবণপ্রতিবন্ধী বিদ্যালয়\n" +
            "ঢাকা, খুলনা, চট্টগ্রাম ও রাজশাহী এ চারটি বিভাগে ৪টি শারীরিক প্রবিতন্ধীদের প্রশিক্ষণ (Physicaly Handicapped Training Centre-PHTC)কেন্দ্রের অভ্যমত্মরে চারটি, ফরিদপুর ও চাঁদপুরে দুইটি এবং সিলেট জেলায় একটি মোট সাতটি বাক-শ্রবণপ্রতিবন্ধী বিদ্যালয়ের মোট আসন সংখ্যা ৬৫০টি।\n" +
            "সেবাসমূহ :\n" +
            "·                    ইশারা ভাষা শিক্ষা;\n" +
            "·                    সাধারণ শিক্ষা;\n" +
            "·                    আবাসিক ও অনাবাসিক সুবিধা;\n" +
            "·                   আবাসিক ছাত্রদের জন্য বিনামূল্যে ভরণপোষণ, বৃত্তিমূলক প্রশিক্ষণ, চিকিৎসাসেবা, খেলাধুলা ও চিত্তবিনোদন; এবং\n" +
            "·                    পুনর্বাসন।\n" +
            "৩.৩ সমন্বিত দৃষ্টিপ্রতিবন্ধী শিক্ষা কার্যক্রম\n" +
            "সমাজসেবা অধিদফতর ৬৪টি জেলায় ৬৪টি সমন্বিত দৃষ্টিপ্রতিবন্ধী শিক্ষা কার্যক্রমের আওতায় এসএসসি পর্যমত্ম অধ্যয়নের সুযোগ রয়েছে।  \n" +
            "সেবাসমূহ :\n" +
            " \n" +
            "·        সাধারণ শিক্ষার্থীদের সাথে আনুষ্ঠানিক শিক্ষা প্রদান (Inclusive Education);\n" +
            "·        ব্রেইল পদ্ধতির মাধ্যমে শিক্ষাদান;\n" +
            "·        বিনামূল্যে ব্রেইল বই ও অন্যান্য সহায়ক শিক্ষা উপকরণ সরবরাহ;\n" +
            "·        আবাসিক ছাত্রদের জন্য বিনামূল্যে ভরণপোষণ, চিকিৎসাসেবা, খেলাধুলা ও চিত্তবিনোদন; এবং\n" +
            "·        পুনর্বাসন।\n" +
            "৩.৪ জাতীয় দৃষ্টিপ্রতিবন্ধী প্রশিক্ষণ ও পুনর্বাসন কেন্দ্র\n" +
            "১৯৭৮ সনে ইআরসিপিএইচ এর অভ্যমত্মরে এ কেন্দ্রটি চালু করা হয়।\n" +
            "সেবাসমূহ :\n" +
            " \n" +
            "·        আবাসন, ভরণপোষণ, চিকিৎসাসেবা, খেলাধুলা ও চিত্তবিনোদন;\n" +
            "·        বাঁশ ও বেতের কাজ (৬ মাস মেয়াদী), হাঁস-মুরগী পালন এবং চলাচলবিষয়ক প্রশিক্ষণ (৬ মাস মেয়াদী);\n" +
            "·        প্রশিক্ষণ শেষে ৪০০০ টাকা হারে পুনর্বাসন ভাতা প্রদান;\n" +
            "·        সরকারি ও বেসরকারি প্রতিষ্ঠানে চাকরি প্রাপ্তিতে সহযোগিতা; এবং\n" +
            "·        কর্মসংস্থান ও পুনর্বাসন।\n" +
            "৩.৫ শারীরিকপ্রতিবন্ধী ব্যক্তিদের বৃত্তিমূলক প্রশিক্ষণ ও পুনর্বাসন কেন্দ্র\n" +
            " \n" +
            "১৯৭৮ সনে গাজীপুর জেলার টঙ্গীতে কেন্দ্রটি চালু করা হয়।\n" +
            "সেবাসমূহ :\n" +
            " \n" +
            "·        আবাসন, ভরণপোষণ, চিকিৎসাসেবা খেলাধুলা ও চিত্তবিনোদন;\n" +
            "·        প্রতিবন্ধী ব্যক্তির ধরন উপযোগী স্বল্পমেয়াদি ইন্ডাস্ট্রিয়াল প্রশিক্ষণ ;\n" +
            "·        প্রশিক্ষণ শেষে ৪০০০ টাকা হারে পুনর্বাসন ভাতা প্রদান;\n" +
            "·        কর্মসংস্থান ও পুনর্বাসন;\n" +
            "·        পদ খালি সাপেক্ষক্ষ কেন্দ্রে চাকরি প্রদান; এবং\n" +
            "·        সরকারি-বেসরকারি বিভিন্ন প্রতিষ্ঠানে চাকরি প্রাপ্তিতে সহযোগিতা।\n" +
            " \n" +
            " \n" +
            "৩.৬ প্রতিবন্ধী ব্যক্তিদের গ্রামীণ পুনর্বাসন উপকেন্দ্র\n" +
            " \n" +
            "বাক-শ্রবণ ও শারীরিকপ্রতিবন্ধী যুবকদেরকে বিভিন্ন প্রকার কারিগরী প্রশিক্ষণ দেওয়ার উদ্দেশ্যে বাগেরহাট জেলার ফকিরহাটে ১৯৭৮ সন থেকে শারীরিকপ্রতিবন্ধী ব্যক্তিদের গ্রামীণ পুনর্বাসন উপকেন্দ্র নামে একটি প্রতিষ্ঠান পরিচালিত হচ্ছে।\n" +
            " \n" +
            "৩.৭ ব্রেইল প্রেস\n" +
            " \n" +
            "দৃষ্টিপ্রতিবন্ধী ছাত্রদের ব্রেইল পদ্ধতিতে শিক্ষাদানের জন্য প্রতিবন্ধীব্যক্তিদের বৃত্তিমূলক প্রশিক্ষণ ও পুনর্বাসন কেন্দ্র (ইআরসিপিএইচ) টঙ্গী, গাজীপুরে একটি ব্রেইল প্রেস রয়েছে। এ প্রেস’এর মাধ্যমে মূদ্রিত পুসত্মকসমূহ বিনামূল্যে সমাজসেবা অধিদফতর পরিচালিত দৃষ্টিপ্রতিবন্ধী বিদ্যালয়সমূহে সরবরাহ করা হয়। মাননীয় প্রধানমন্ত্রীর কার্যালয়ের অধীন এটুআই প্রকল্পের অর্থায়নে তিনটি ব্রে্ইল প্রিন্টারসহ আনুষাঙ্গিক যন্ত্রপাতি ইতোমধ্যে স্থাপন করা হয়েছে।\n" +
            " \n" +
            "৩.৮ কৃত্রিম অঙ্গ উৎপাদন কেন্দ্র\n" +
            " \n" +
            "শারীরিক প্রতিবন্ধী ব্যক্তিদের বৃত্তিমূলক প্রশিক্ষণ ও পুনর্বাসন কেন্দ্র (ইআরসিপিএইচ) টঙ্গী, গাজীপুরের অভ্যমত্মরে শারীরিক প্রতিবন্ধী ব্যক্তিদের কৃত্রিম অঙ্গ উৎপাদন কেন্দ্র রয়েছে।\n" +
            "৩.৯ মানসিকপ্রতিবন্ধী শিশুদের প্রতিষ্ঠান\n" +
            " \n" +
            "অন্যান্য প্রতিবন্ধী শিশুদের ন্যায় মানসিক প্রতিবন্ধী শিশুদের রক্ষণাবেক্ষণ ও চিকিৎসা প্রদানের মাধ্যমে সুস্থ ও স্বাভাবিক জীবনে ফিরিয়ে আনার লক্ষ্যেচট্টগ্রাম জেলার রউফাবাদে মানসিক প্রতিবন্ধী শিশুদের প্রতিষ্ঠান স্থাপন করা হয়।  বর্তমান নিবাসীর সংখ্যা ১১২ জন এবং এ পর্যমত্ম পুনর্বাসিতের সংখ্যা ১০৯ জন।\n","৪.১ শিশু (কিশোর-কিশোরী) উন্নয়ন কেন্দ্র\n" +
            "বিচার প্রক্রিয়ায় আটকাদেশপ্রাপ্ত শিশু {আইনের সঙ্গে সংঘাতে জড়িত শিশু (এমন কোন  শিশু, যে দ-বিধির ধারা ৮২ ও ৮৩ এ বিধান সাপেক্ষ, বিদ্যমান কোন আইনের অধীন কোন অপরাধের দায়ে অভিযুক্ত অথবা বিচারে দোষী সাব্যসত্ম) এবং আইনের সংস্পর্শে আসা শিশু (এমন কোন শিশু, যে বিদ্যমান কোন আইনের অধীনে কোন অপরাধের শিকার বা সাক্ষী) এবং বিচারের আওতাধীন শিশুর আবাসন, সংশোধন ও উন্নয়নের লক্ষ্যেশিশু আইন, ২০১৩ এর ধারা ৫৯ অনুসারে শিশু (কিশোর-কিশোরী) উন্নয়ন কেন্দ্র প্রতিষ্ঠা করা হয়েছে। শিশু (কিশোর-কিশোরী) উন্নয়ন কেন্দ্রে আগত ও অবস্থানরত শিশুদের আবাসন, সংশোধন, উন্নয়ন, রক্ষণাবেক্ষণের সুব্যবস্থা রয়েছে। এসব শিশুকে সমাজে সুনাগরিক হিসেবে গড়ে তোলার জন্য গাজীপুরের টঙ্গীতে ১৯৭৮ সনে ১টি শিশু (কিশোর) উন্নয়ন কেন্দ্র, কোণাবাড়ীতে ২০০২ সনে ১টি শিশু (কিশোরী) উন্নয়ন কেন্দ্র এবং যশোরের পুলের হাটে ১৯৯২ সনে ১টি শিশু (কিশোর) উন্নয়ন কেন্দ্র স্থাপিত হয়। নিবিড় তত্ত্বাবধানের মাধ্যমে আইনের সংস্পর্শে আসা ও আইনের সাথে সংর্ঘষে জড়িত কিশোরকিশোরীদের উপযুক্ত কেস ওয়ার্ক, কেস ম্যানেজমেন্ট, গাইডেন্স, কাউন্সিলিং, শিক্ষা, প্রশিক্ষণ ও ডাইভারশন পদ্ধতির মাধ্যমে তাদের মানষিকতার উন্নয়নপূর্বক সমাজে পুনর্বাসন ও পুনঃএকীকৃত করাই এ সব প্রতিষ্ঠানের মূল লক্ষ্য।\n" +
            "\n" +
            "৪.২ সরকারি আশ্রয় কেন্দ্র\n" +
            "\n" +
            "ভিক্ষাবৃত্তি ও অন্যান্য প্রতিবন্ধকতাপূর্ণ অবস্থায় নিপতিত ব্যক্তিগণকে সরকারি তত্ত্বাবধানে রেখে প্রশিক্ষণ ও অন্যান্য উপায়ে সমাজে পুনর্বাসিত করার লক্ষ্যেভবঘুরে আইন, ১৯৪৩ প্রবর্তন করা হয়। এ আইন যুগোপযোগী করে বর্তমানে ‘ভবঘুরে ও নিরাশ্রয় ব্যক্তি (পুর্নবাসন) আইন, ২০১১’ জারি করা হয়েছে।\n" +
            "আশ্রয় কেন্দ্রের নিবাসীদের আশ্রয় প্রদান, ভরণপোষণ ও রক্ষণাবেক্ষণ, স্বাস্থ্য ও চিকিৎসা সেবা, শরীরচর্চা, সাধারণ, ব্যবহারিক ও নৈতিক শিক্ষা, ধর্মীয় শিক্ষা, বৃত্তিমূলক প্রশিক্ষণ, সাংস্কৃতিক কর্মকা-, চিত্তবিনোদন, মানসিক উন্নয়ন, ব্যক্তিকেন্দ্রিক সমাজকর্ম, উদ্বুদ্ধকরণ, পুনর্বাসন ও অনুসরণ ইত্যাদি এ কর্মসূচির আওতাভুক্ত। নিবাসীদের জন্য ইন্ডাস্ট্রিয়াল গার্মেন্টস, দর্জি বিদ্যা, তাঁত প্রশিক্ষণ, এমব্রয়ডারি, বাঁশ ও বেতের কাজ, চট ও পাটের কাজ, উলের কাজ, রান্না শিক্ষা, কার্পেন্টারি, চুলকাটা, কৃষি ও মৎস্য চাষসহ বিভিন্ন ধরনের প্রশিক্ষণের ব্যবস্থা রয়েছে।\n" +
            "৪.৩ সামাজিক প্রতিবন্ধী মেয়েদের প্রশিক্ষণ ও পুনর্বাসন\n" +
            "\n" +
            "‘সামাজিক প্রতিবন্ধী মেয়ে’ বলতে তাদেরকে বোঝায় যারা দারিদ্র্য, প্রতারণা, জবরদসিত্ম, অসহায়ত্ব এবং অন্যান্য প্রতিকূল অবস্থার শিকার হয়ে অর্থ বা উপঢৌকনের বিনিময়ে যৌন কর্মকা-- লিপ্ত তথা নৈতিকতা পরিপন্থী পেশায় নিয়োজিত হয়। সামাজিক প্রতিবন্ধী মেয়েদের প্রশিক্ষণ ও পুনর্বাসন কার্যক্রম এর আওতায় ঢাকা, চট্টগ্রাম, রাজশাহী, খুলনা, বরিশাল ও সিলেটে ৬টি বিভাগে ৬টি প্রশিক্ষণ ও পুনর্বাসন কেন্দ্র রয়েছে।\n" +
            "\n" +
            "\n" +
            "৪.৪ মহিলা ও শিশু-কিশোরী হেফাজতীদের নিরাপদ আবাসন\n" +
            "\n" +
            "সিলেট, বরিশাল, চট্রগ্রাম, রাজশাহী, খুলনা (বাগেরহাট), এবং ঢাকার মিরপুরে অবস্থিত সমাজসেবা অধিদফতর পরিচালিত সরকারি আশ্রয় কেনদ্র (অভ্যর্থনা কেন্দ্র) মোট ৬টি কেন্দ্রে মহিলা ও শিশু-কিশোরী হেফাজতীদের নিরাপদ আবাসন প্রতিষ্ঠান রয়েছে।\n" +
            "সেবাসমূহ :\n" +
            "\n" +
            "·        নিরাপদ আশ্রয় প্রদান ;\n" +
            "·        বিনামূল্যে খাদ্য, বস্ত্র, চিকিৎসা, শিক্ষা ও বিনোদন;\n" +
            "·        কেস ওয়ার্ক’এর মাধ্যমে আর্থ-সামাজিক ও ব্যক্তিগত অবস্থা সম্পর্কে ধারণা লাভ এবং তাদের মানসিক অবস্থার উন্নয়ন;\n" +
            "·        নির্ধারিত শুনানীর দিনে নিবাসীর নিরাপত্তা নিশ্চিতপূর্বক কোর্ট’এ হাজির করা এবং কোর্ট থেকে কেন্দ্রে ফেরত আনা;\n" +
            "·        দক্ষ জনসম্পদে উন্নীত করার লক্ষ্যেসচেতনতা বৃদ্ধি ও বৃত্তিমূলক প্রশিক্ষণের ব্যবস্থা করা;\n" +
            "·        কেন্দ্রে অবস্থানকালীন সকল প্রকার শারীরিক ও মানসিক চিকিৎসার ব্যবস্থাসহ সম্ভাব্য আইনগত সহায়তা প্রদান করা; এবং\n" +
            "·        কেন্দ্রে অবস্থানরত মহিলা ও শিশু হেফাজতীদের মানবাধিকার সমুন্নত রাখা।\n" +
            "\n" +
            "৪.৫ প্রবেশন এন্ড আফটার কেয়ার সার্ভিসেস কার্যক্রম\n" +
            "\n" +
            "আধুনিক চিমত্মাবিদগণ সর্বোপরি অপরাধ বিশেষজ্ঞগণ অপরাধ সংশোধনের ক্ষক্ষত্রে শাসিত্মদান ব্যবস্থার পরিবর্তে সংশোধন ও পুনবার্সনমূলক ব্যবস্থা উদ্ভাবন করেছেন। ১৯৬০ সনে ‘দ্য প্রবেশন অব অফেন্ডার্স’ অর্ডিন্যান্স জারির মধ্য দিয়ে বাংলাদেশে এ কার্যক্রম শুরম্ন হয়। এ উদ্দেশ্যে প্রথম অপরাধীদের প্রাথমিক অবস্থায় সংশোধনের জন্য সমাজভিত্তিক পুনঃএকীকরণ কার্যক্রম (Social Re-integration) গ্রহণ করা হয়। সমাজসেবা অধিদফতর কর্তৃক পরিচালিত প্রবেশন সার্ভিস একটি অন্যতম সমাজভিত্তিক অপরাধ সংশোধনমূলক কার্যক্রম হিসেবে ব্যাপক গুরম্নত্ব লাভ করেছে।\n" +
            "\n" +
            "\n","৫.১ সরকারি শিশু পরিবার\n" +
            "\n" +
            "শিশুদের প্রতি সাংবিধানিক অঙ্গীকার, জাতীয় ও আমত্মর্জাাতিক প্রতিশ্রম্নতি বাসত্মবায়ন এবং সমাজকল্যাণ দর্শনের আদর্শে ব্রতী হয়ে সমাজসেবা অধিদফতর পিতৃহীন কিংবা পিতৃমাতৃহীন দুঃস্থহ এতিম শিশুদের স্নেহভালবাসা, শিশু অধিকার সুরক্ষা ও আদরযত্নে  লালনপালনসহ তাদের সাধারণ শিক্ষা, স্বাস্থ্য, নিরাপত্তা, প্রশিক্ষণ, চিত্তবিনোদন এবং পুনর্বাসনের জন্য সারা দেশে ৮৫টি সরকারি শিশু পরিবার পরিচালনা করে আসছে। এ সকল প্রতিষ্ঠানের মধ্যে বালক শিশু পরিবারের সংখ্যা ৪৩টি, বালিকা শিশু পরিবারের সংখ্যা ৪১টি এবং মিশ্র শিশু পরিবারের সংখ্যা ১টি।\n" +
            "৫.২ ক্যাপিটেশন গ্র্যান্টপ্রাপ্ত বেসরকারি এতিমখানা\n" +
            "\n" +
            "বেসরকারি এতিমখানা সুষ্ঠুভাবে পরিচালনার জন্য সরকার দীর্ঘ দিন যাবৎ অনুদান (ক্যাপিটেশন গ্রান্ট) প্রদান করে আসছে। এ সকল প্রতিষ্ঠানে পিতৃমাতৃহীন এতিম শিশুদের রক্ষণাবেক্ষণ ও ভরণপোষণের পাশাপাশি ধর্মীয় ও সাধারণ শিক্ষা এবং কারিগরী ও বৃত্তিমূলক প্রশিক্ষণ প্রদান করা হয়ে থাকে।\n" +
            "\n" +
            "৫.৩ ছোটমণি নিবাস\n" +
            "\n" +
            "সমাজসেবা অধিদফতরের আওতায় পরিত্যক্ত, ঠিকানাহীন, দাবীদারহীন ও পাচারকারীদের নিকট থেকে উদ্ধারকৃত এবং ০-৭ বছর বয়স পর্যমত্ম বিপন্ন শিশুদের গ্রহণ, রক্ষণাবেক্ষণ, ভরণপোষণ, প্রাক-প্রাথমিক শিক্ষা ও চিকিৎসার সুযোগসহ লালনপালনের জন্য ১৯৬২ সনে ঢাকার আজিমপুরে ১টি ছোটমণি নিবাস স্থাপিত হয়। পরবর্তীতে চট্টগ্রাম, রাজশাহী, সিলেট, খুলনা ও বরিশাল এ ৫টি বিভাগে ৫টি ছোটমণি নিবাস প্রতিষ্ঠিত হয়।\n" +
            "\n" +
            "৫.৪ দিবাকালীন শিশুযত্ন কেন্দ্র\n" +
            "স্বল্প আয়ের কর্মজীবী মা’র সমত্মানদের কর্মকালীন রক্ষণাবেক্ষণ ও সঠিক সামাজিকীকরণ নিশ্চিত করার লক্ষ্যেপ্রতিষ্ঠানটি অগ্রণী ভূমিকা পালন করে যাচ্ছে। ১৯৬২ সনে ঢাকার আজিমপুরে ৫০ আসনবিশিষ্ট দিবাকালীন শিশুযত্ন কেন্দ্রটি স্থাপন করা হয়।\n" +
            "সেবাসমূহ :\n" +
            "\n" +
            "·        ৪-৮ বছর বয়সের শিশুদের সকাল ৮-০০ থেকে বিকাল ৫-০০ টা পর্যমত্ম দিবাকালীন সেবাদান;\n" +
            "·        শিশুদের প্রতিষ্ঠানে অবস্থানকালীন সকাল ও বিকালের নাসত্মাসহ দুপুরের খাবার সরবরাহ;\n" +
            "·        শিশুদের প্রাক-প্রাথমিক শিক্ষা, খেলাধুলা ও বিনোদন;\n" +
            "·        প্রতিষ্ঠানে অবস্থানকালীন প্রতিষ্ঠানের পোষাক পরিধান;\n" +
            "·        দুপুরে শিশুদের ঘুমানোর ব্যবস্থা; এবং\n" +
            "·        শিশুদের নিরাপত্তাবিধানসহ মাতৃস্নেহে লালনপালন ।\n" +
            "\n" +
            "\n" +
            "৫.৫ দুঃস্থহ শিশুদের প্রশিক্ষণ ও পুনর্বাসন কেন্দ্র\n" +
            "\n" +
            "দরিদ্র, অসহায়, ছিন্নমূল ও দুঃস্থহ শিশুদের রক্ষণাবেক্ষণ, ভরণপোষণ, শিক্ষা, প্রশিক্ষণ এবং অন্যান্য উপায়ে সুনাগরিক হিসেবে গড়ে তোলা এবং তাদের আর্থ-সামাজিক পুনর্বাসনের জন্য প্রথম গাজীপুরের কোণাবাড়ীতে, চট্টগ্রামের রাঙ্গুনিয়ায় বালকদের জন্য এবং গোপালগঞ্জের টুঙ্গীপাড়ায় বালিকাদের ১টিসহ মোট ৩টি  দুঃস্থহ শিশু প্রশিক্ষণ ও পুনর্বাসন কেন্দ্র প্রতিষ্ঠিত হয়।\n" +
            "\n" +
            "৫.৬ প্রাক-বৃত্তিমূলক প্রশিক্ষণ কেন্দ্র\n" +
            "\n" +
            "সরকারি শিশু পরিবা তেজগাঁও, রূপগঞ্জ, চাঁদপুর, রাজশাহী এবং বাগেরহাট’এ প্রাক-বৃত্তিমূলক প্রশিক্ষণ কর্মসূচিতে দক্ষ জনসম্পদ হিসেবে গড়ে তোলার উদ্দেশ্যে শিশুদের লাইট ইঞ্জিনিয়ারিং, ডিজেল মেকানিজম, সাধারণ ফিটার্স, ওয়েল্ডিং, কাঠের কাজ ইত্যাদি বিষয়ে দক্ষ কারিগর দ্বারা প্রশিক্ষণ দেওয়া হয়।\n","৬.১ মহিলাদের আর্থ-সামাজিক প্রশিক্ষণ কেন্দ্র\n" +
            "\n" +
            "১৯৭৩ সনে মহিলাদের জন্য দুটি সোসিও ইকোনোমিক ট্রেনিং সেন্টার চালু করা হয়। ঢাকার মিরপুর ও রংপুরের শালবনে প্রতিষ্ঠিত সেন্টার দুটিতে এ কার্যক্রম বাসত্মবায়নের প্রথম পদক্ষেপ নেওয়া হয়। নিম্নবিত্ত ও মধ্যবিত্ত পরিবারের মহিলারা যাতে প্রশিক্ষণের মাধ্যমে পরিবারের আয় বৃদ্ধিতে সক্রিয় অংশগ্রহণ করে পরিবারের জীবনযাত্রার মান উন্নত করতে সক্ষম হয়, সে উদ্দেশ্যেই স্থাপিত হয় আর্থ-সামাজিক প্রশিক্ষণ কেন্দ্র।\n" +
            "\n" +
            "৬.২ দুঃস্থহ মহিলাদের বৃত্তিমূলক প্রশিক্ষণ ও উৎপাদন কেন্দ্র\n" +
            "\n" +
            "গাজীপুর জেলার টঙ্গীর দত্তপাড়াস্থ বাস্ত্তহারা পুনর্বাসন এলাকায় বসবাসকারী গৃহহীন ও ভূমিহীন বেকারদের বৃত্তিত্মমূলক প্রশিক্ষণের মাধ্যমে উৎপাদনশীল ও কর্মোপযোগী করে গড়ে তোলার লক্ষ্যেএ কেন্দ্রটি কাজ করে যাচ্ছে।\n"
    };
/*

    static String[] title = {

            Resources.getSystem().getString(R.string.l1),
            Resources.getSystem().getString(R.string.l2),
            Resources.getSystem().getString(R.string.l3),
            Resources.getSystem().getString(R.string.l4),
            Resources.getSystem().getString(R.string.l5),
            Resources.getSystem().getString(R.string.l6),
            Resources.getSystem().getString(R.string.l7),
            };

    static String[] body = {

            Resources.getSystem().getString(R.string.l1d),
            Resources.getSystem().getString(R.string.l2d),
            Resources.getSystem().getString(R.string.l3d),
            Resources.getSystem().getString(R.string.l4d),
            Resources.getSystem().getString(R.string.l5d),
            Resources.getSystem().getString(R.string.l6d),
            Resources.getSystem().getString(R.string.l7d),
          };
     */
    static String[] title1 = {"সমাজসেবা অধিদপ্তর এর কার্যক্রমসমূহ","সমাজসেবা অধিদপ্তর প্রদত্ত সেবাসমূহ ও সেবাগ্রহীতা","প্রশাসন ও অর্থ উইং হতে প্রদত্ত সেবা","প্রশাসন ও অর্থ উইং হতে সেবা প্রাপ্তির আধিশাখা ও শাখাসমূহঃ","কার্যক্রম উইং হতে প্রদত্ত সেবা"," কার্যক্রম উইং হতে প্রদত্ত সেবা প্রাপ্তির অধিশাখা ও শাখাসমূহ","প্রতিষ্ঠান উইং হতে সেবা প্রাপ্তির অধিশাখা ও শাখাসমূহ"};
    static String[] body1 = {"সমাজসেবা অধিদপ্তর সমাজের সুবিধা বঞ্চিত সম্যসাগ্রস্থ, অনগ্রসর, অসহায়, দুস্থ, বয়স্ক বিধবা, বিপন্ন শিশু, এতিম, ভবঘুরে, প্রতিবন্ধী ও অটিস্টিক ব্যক্তি, দরিদ্র রোগী, কিশোর অপরাধী, ভুমিহীন, বেকার, হিজড়া, বেদে, দলিত ও হরিজন সম্প্রদায় এবং দরিদ্রসীমার নীচে বসবাসকারী জনগোষ্ঠী কল্যান, উন্নয়ন ও অধিকার সুরক্ষা, আধুনিক সেবা প্রদান,দারিদ্র্য নিরসন ও সামাজিক নিরাপত্তা প্রদানে বহুমাত্রিক কার্যক্রম/কর্মসূচি/প্রকল্প বাস্তবায়ন করেছে। এছাড়া ডিজিটাল বাংলাদেশ বিনীর্মানে রয়েছে আইসিটি বিষয়ক কার্যক্রম।","-দরিদ্র ও পশ্চাৎপদ জনগোষ্ঠীর আর্থসামাজিক উন্নয়নে সুদ্মুক্ত ক্ষুদ্রঋণ ;\n" +
            "-সামাজিক নিরাপত্তা প্রদানে বয়স্ক, বিধবা ও প্রতিবন্ধীব্যক্তি/ শিক্ষার্থীদের ভাতা/ উপবৃত্তি;\\n" +
            "-ডিজিটাল বাংলাদেশ বিনির্মানে তথ্য প্রযুক্তি ও আইসিটি কার্যক্রম;\n" +
            "-সচ্ছতা ও জবাবদিহিতা নিশ্চিতকরণে তথ্য অধিকার আইন অনুযায়ী দ্রুত ই-সেবা প্রদান;\n" +
            "-এতিম, বিপন্ন ও দুস্থ শিশু সুরক্ষা, প্রতিপালন, উন্নয়ন ও পুনর্বাসন;\n" +
            "-প্রতিবন্ধী ব্যক্তিদের সুরক্ষা, প্রতিপালন, উন্নয়ন ও পুনর্বাসন;\n" +
            "-ভবঘুরে ও অপরাধগ্রস্থপ্রবনদের কল্যাণ, উন্নয়ন ও পুনর্বাসন;\n" +
            "-হিজড়া, বেদে, দলিত ও হরিজন সম্প্রদায়ের জীবনমান উন্নয়ন;\n" +
            "-ক্যান্সার, কিডনি ও লিভার সিরোসিস রোগীদের জীবন্মান উন্নয়ন;\n" +
            "-দরিদ্র চা-শ্রমিকদের চিকিৎসা সেবা ও পুনর্বাসন;\n" +
            "-সামাজিক অবক্ষয়ের শিকার কিশোর/ কিশোরী ও নিরাপদ হেফাজতিদের আবাসন, প্রশিক্ষণ ও পুনর্বাসন;\n" +
            "-আইসিটি ও পেশাভিত্তিক দক্ষতা উন্নয়ন প্রশিক্ষণ;\n" +
            "-সেচ্ছাসেবী সংস্থা নিবন্ধন ও নিয়ন্ত্রন;","সদর কার্যালয় ও মাঠ প্রশাসনে নিয়োগ, বদলী, পদোন্নতি, উচ্চতর স্কেল, বাজেট প্রণয়ন,\n" +
            "বরাদ্দ ছাড়করণ, প্রকাশনা, গবেষণা, মূল্যায়ন ও গবেষণা, গনসংযোগ, শৃংখলা ও তদন্ত, পরিকল্পনা,\n" +
            "দক্ষতা উন্নয়ন ও আইসিটি প্রশিক্ষণ, ভান্ডার সংরক্ষন, মূদ্রন ও মনোহরী দ্রব্য ও যানবাহন ইত্যাদি নিয়ন্ত্রন ও সার্বিক ব্যবস্থাপনা ও উইং এর মাধ্যমে সম্পন্ন হয়।  ","-প্রশাসন-১(গেজেটেড)\n" +
            "-প্রশাসন-২(নন-গেজেটেড)\n" +
            "-অর্থ শাখা\n" +
            "-হিসাব রক্ষণ ও অডিট শাখা\n" +
            "-জাতীয় সমাজসেবা একাডেমি\n" +
            "-আঞ্চলিক প্রশিক্ষণ কেন্দ্র\n" +
            "-পরিকল্পনা ও উন্নয়ন\n" +
            "-গবেষণা, মূল্যায়ন, প্রকাশনা ও গণ-সংযোগ\n" +
            "-শৃঙ্খলা ও তদন্ত শাখা\n" +
            "-এসিআর শাখা\n" +
            "-ভান্ডার, যন্ত্রপাতি ও যানবাহন শাখা\n" +
            "-আইন শাখা \n" +
            "পরিচালক( প্রশাসন ও অর্থ ) এর নেতৃত্বে ১ জন অতিরিক্ত পরিচালক, ১ জন অধ্যক্ষ, ৪ জন উপপরিচালক, ৮ জন সহকারী পরিচালক, ১ জন উপাধ্যক্ষ ও ১৫ জন সমাজসেবা অফিসার/ প্রভাষক যাবতীয় সেবা প্রদানের দায়িত্ব পালন করে। \n","দারিদ্র্য বিমোচনে ক্ষুদ্রঋণ, সামাজিক নিরাপত্তা বেষ্টনীর আওতায় বয়স্কভাতা, বিধবা ভাতা, অসচ্ছল প্রতিবন্ধী ভাতা ও প্রতিবন্ধী শিক্ষার্থীদের উপবৃত্তি, হিজড়া, দলিত ও বেদে জনগোষ্ঠীর জীবন দক্ষতা উন্নয়ন প্রশিক্ষণ ও বিশেষ/ বয়স্কভাতা, ক্যান্সার, কিডনি ও লিভার সিরোসিস আক্রান্ত দরিদ্র রোগীদের আর্থিক সহয়তা, দরিদ্র চা-শ্রমিকদের এককালীন খাদ্র সহায়তা, দরিদ্ররোগীদের চিকিৎসা সেবা, প্রবেশন এন্ড আফটার কেয়ার এবং সেচ্ছাসেবী সংস্থা নিবন্ধন ও নিয়ন্ত্রন ইত্যাদি কার্যক্রম এ উইং এর মাধ্যমে সম্পন্ন করা হয়। ","- দারিদ্র্য বিমোচোন কার্যক্রম অধিশাখা \n" +
            "-নিবন্ধন ও নিয়ন্ত্রণ শাখা\n" +
            "-মাতৃকেন্দ্র কার্যক্রম শাখা\n" +
            "- ভাতা কার্যক্রম অধিশাখা\n" +
            "-চিকিৎসা ও প্রবেশন শাখা\n" +
            "-শহর সমাজসেবা কার্যক্রম শাখা\n" +
            "\n" +
            "\n" +
            "পরিচালক(কার্যক্রম) এর নেতৃত্বে ২ জন অতিরিক্ত পরিচালক,৫ জন উপপরিচালক, ৭ জন সহকারী পরিচালক, ২ জন উপসহকারী পরিচালক ও ১২ জন সমাজসেবা অফিসার যাবতীয় সেবা প্রদানে দায়িত্ব পালন করে। \n","-অনাথ শিশু ও প্রতিবন্ধী অশিধাখা\n" +
            "-ভবঘুরে নিয়ন্ত্রন বাস্তবায়ন ও মনিটরিং শাখা\n" +
            "-বেসরকারি এতিমখানা ও শিশুকল্যান শাখা\n" +
            "-সরকারি শিশু পরিবার শাখা\n" +
            "-প্রতিবন্ধী বিষয়ক শাখা\n" +
            "-প্রকৌশল শাখা \n" +
            "\n" +
            "\n" +
            "পরিচালক( প্রতিষ্ঠান ) এর নেতৃত্বে ১ জন অতিরক্ত পরিচালক, ৩ জন উপপরিচালক, ৫ জন সহকারী পরিচালক, ও ৫ জন সমাজসেবা/ প্রশাসনিক অফিসার যাবতীয় সেবা প্রদানের দায়িত্ব পালন করেন। \n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "মাঠ পর্যায় হতে সদর কার্যালয়ে সেবা/ তথ্য প্রাপ্তিঃ\n" +
            "-প্রাথমিক পর্যায়ঃ সংশ্লিষ্ট কার্যালয়ে ও  প্রতিষ্ঠান প্রধান\n" +
            "-দ্বিতীয় পর্যায়ঃ সংশ্লিষ্ট জেলার উপপরিচালক\n" +
            "-তৃতীয় পর্যায়ঃ পরিচালক (প্রশাসন ও অর্থ) ফোনঃ ০২-৯১২৬৬৯২\n" +
            "\t          পরিচালক(কার্যক্রম) ফোনঃ ০২-৯১১১৭৪৯\n" +
            "\t           পরিচালক(প্রতিষ্ঠান) ফোনঃ ০২-৮১৮১৫০৪"};

    public static List<Data> getListData() {
        List<Data> item = new ArrayList<>();
        for(int i=0;i<title.length;i++){
            Data data = new Data();
            data.setDescription(body[i]);
            data.setTitle(title[i]);
            item.add(data);

           // u.title = title.;
            //item.add();

        }
        return item;

    }

    public static List<Data> getListDataOfCiizenCharter() {
        List<Data> item = new ArrayList<>();
        for(int i=0;i<title1.length;i++){
            Data data = new Data();
            data.setDescription(body1[i]);
            data.setTitle(title1[i]);
            item.add(data);

           // u.title = title.;
            //item.add();

        }
        return item;

    }




}
