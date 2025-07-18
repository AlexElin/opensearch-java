/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch._types.analysis;

import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.opensearch.client.json.JsonEnum;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.TaggedUnion;
import org.opensearch.client.util.TaggedUnionUtils;

// typedef: _types.analysis.Analyzer

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class Analyzer implements TaggedUnion<Analyzer.Kind, AnalyzerVariant>, PlainJsonSerializable {
    /**
     * {@link Analyzer} variant kinds.
     */
    public enum Kind implements JsonEnum {
        Cjk("cjk"),
        Custom("custom"),
        Dutch("dutch"),
        Fingerprint("fingerprint"),
        IcuAnalyzer("icu_analyzer"),
        Keyword("keyword"),
        Kuromoji("kuromoji"),
        Language("language"),
        Nori("nori"),
        Pattern("pattern"),
        Phone("phone"),
        PhoneSearch("phone-search"),
        Simple("simple"),
        Smartcn("smartcn"),
        Snowball("snowball"),
        Standard("standard"),
        Stop("stop"),
        Whitespace("whitespace");

        private final String jsonValue;

        Kind(String jsonValue) {
            this.jsonValue = jsonValue;
        }

        @Override
        public String jsonValue() {
            return jsonValue;
        }
    }

    private final Kind _kind;
    private final AnalyzerVariant _value;

    @Override
    public final Kind _kind() {
        return _kind;
    }

    @Override
    public final AnalyzerVariant _get() {
        return _value;
    }

    public Analyzer(AnalyzerVariant value) {
        this._kind = ApiTypeHelper.requireNonNull(value._analyzerKind(), this, "<variant kind>");
        this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
    }

    private Analyzer(Builder builder) {
        this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
        this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
    }

    public static Analyzer of(Function<Analyzer.Builder, ObjectBuilder<Analyzer>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Is this variant instance of kind {@code cjk}?
     */
    public boolean isCjk() {
        return _kind == Kind.Cjk;
    }

    /**
     * Get the {@code cjk} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code cjk} kind.
     */
    public CjkAnalyzer cjk() {
        return TaggedUnionUtils.get(this, Kind.Cjk);
    }

    /**
     * Is this variant instance of kind {@code custom}?
     */
    public boolean isCustom() {
        return _kind == Kind.Custom;
    }

    /**
     * Get the {@code custom} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code custom} kind.
     */
    public CustomAnalyzer custom() {
        return TaggedUnionUtils.get(this, Kind.Custom);
    }

    /**
     * Is this variant instance of kind {@code dutch}?
     */
    public boolean isDutch() {
        return _kind == Kind.Dutch;
    }

    /**
     * Get the {@code dutch} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code dutch} kind.
     */
    public DutchAnalyzer dutch() {
        return TaggedUnionUtils.get(this, Kind.Dutch);
    }

    /**
     * Is this variant instance of kind {@code fingerprint}?
     */
    public boolean isFingerprint() {
        return _kind == Kind.Fingerprint;
    }

    /**
     * Get the {@code fingerprint} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code fingerprint} kind.
     */
    public FingerprintAnalyzer fingerprint() {
        return TaggedUnionUtils.get(this, Kind.Fingerprint);
    }

    /**
     * Is this variant instance of kind {@code icu_analyzer}?
     */
    public boolean isIcuAnalyzer() {
        return _kind == Kind.IcuAnalyzer;
    }

    /**
     * Get the {@code icu_analyzer} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code icu_analyzer} kind.
     */
    public IcuAnalyzer icuAnalyzer() {
        return TaggedUnionUtils.get(this, Kind.IcuAnalyzer);
    }

    /**
     * Is this variant instance of kind {@code keyword}?
     */
    public boolean isKeyword() {
        return _kind == Kind.Keyword;
    }

    /**
     * Get the {@code keyword} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code keyword} kind.
     */
    public KeywordAnalyzer keyword() {
        return TaggedUnionUtils.get(this, Kind.Keyword);
    }

    /**
     * Is this variant instance of kind {@code kuromoji}?
     */
    public boolean isKuromoji() {
        return _kind == Kind.Kuromoji;
    }

    /**
     * Get the {@code kuromoji} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code kuromoji} kind.
     */
    public KuromojiAnalyzer kuromoji() {
        return TaggedUnionUtils.get(this, Kind.Kuromoji);
    }

    /**
     * Is this variant instance of kind {@code language}?
     */
    public boolean isLanguage() {
        return _kind == Kind.Language;
    }

    /**
     * Get the {@code language} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code language} kind.
     */
    public LanguageAnalyzer language() {
        return TaggedUnionUtils.get(this, Kind.Language);
    }

    /**
     * Is this variant instance of kind {@code nori}?
     */
    public boolean isNori() {
        return _kind == Kind.Nori;
    }

    /**
     * Get the {@code nori} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code nori} kind.
     */
    public NoriAnalyzer nori() {
        return TaggedUnionUtils.get(this, Kind.Nori);
    }

    /**
     * Is this variant instance of kind {@code pattern}?
     */
    public boolean isPattern() {
        return _kind == Kind.Pattern;
    }

    /**
     * Get the {@code pattern} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code pattern} kind.
     */
    public PatternAnalyzer pattern() {
        return TaggedUnionUtils.get(this, Kind.Pattern);
    }

    /**
     * Is this variant instance of kind {@code phone}?
     */
    public boolean isPhone() {
        return _kind == Kind.Phone;
    }

    /**
     * Get the {@code phone} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code phone} kind.
     */
    public PhoneAnalyzer phone() {
        return TaggedUnionUtils.get(this, Kind.Phone);
    }

    /**
     * Is this variant instance of kind {@code phone-search}?
     */
    public boolean isPhoneSearch() {
        return _kind == Kind.PhoneSearch;
    }

    /**
     * Get the {@code phone-search} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code phone-search} kind.
     */
    public PhoneSearchAnalyzer phoneSearch() {
        return TaggedUnionUtils.get(this, Kind.PhoneSearch);
    }

    /**
     * Is this variant instance of kind {@code simple}?
     */
    public boolean isSimple() {
        return _kind == Kind.Simple;
    }

    /**
     * Get the {@code simple} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code simple} kind.
     */
    public SimpleAnalyzer simple() {
        return TaggedUnionUtils.get(this, Kind.Simple);
    }

    /**
     * Is this variant instance of kind {@code smartcn}?
     */
    public boolean isSmartcn() {
        return _kind == Kind.Smartcn;
    }

    /**
     * Get the {@code smartcn} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code smartcn} kind.
     */
    public SmartcnAnalyzer smartcn() {
        return TaggedUnionUtils.get(this, Kind.Smartcn);
    }

    /**
     * Is this variant instance of kind {@code snowball}?
     */
    public boolean isSnowball() {
        return _kind == Kind.Snowball;
    }

    /**
     * Get the {@code snowball} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code snowball} kind.
     */
    public SnowballAnalyzer snowball() {
        return TaggedUnionUtils.get(this, Kind.Snowball);
    }

    /**
     * Is this variant instance of kind {@code standard}?
     */
    public boolean isStandard() {
        return _kind == Kind.Standard;
    }

    /**
     * Get the {@code standard} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code standard} kind.
     */
    public StandardAnalyzer standard() {
        return TaggedUnionUtils.get(this, Kind.Standard);
    }

    /**
     * Is this variant instance of kind {@code stop}?
     */
    public boolean isStop() {
        return _kind == Kind.Stop;
    }

    /**
     * Get the {@code stop} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code stop} kind.
     */
    public StopAnalyzer stop() {
        return TaggedUnionUtils.get(this, Kind.Stop);
    }

    /**
     * Is this variant instance of kind {@code whitespace}?
     */
    public boolean isWhitespace() {
        return _kind == Kind.Whitespace;
    }

    /**
     * Get the {@code whitespace} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code whitespace} kind.
     */
    public WhitespaceAnalyzer whitespace() {
        return TaggedUnionUtils.get(this, Kind.Whitespace);
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        mapper.serialize(_value, generator);
    }

    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Analyzer> {
        private Kind _kind;
        private AnalyzerVariant _value;

        public Builder() {}

        private Builder(Analyzer o) {
            this._kind = o._kind;
            this._value = o._value;
        }

        public ObjectBuilder<Analyzer> cjk(CjkAnalyzer v) {
            this._kind = Kind.Cjk;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> cjk(Function<CjkAnalyzer.Builder, ObjectBuilder<CjkAnalyzer>> fn) {
            return this.cjk(fn.apply(new CjkAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> custom(CustomAnalyzer v) {
            this._kind = Kind.Custom;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> custom(Function<CustomAnalyzer.Builder, ObjectBuilder<CustomAnalyzer>> fn) {
            return this.custom(fn.apply(new CustomAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> dutch(DutchAnalyzer v) {
            this._kind = Kind.Dutch;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> dutch(Function<DutchAnalyzer.Builder, ObjectBuilder<DutchAnalyzer>> fn) {
            return this.dutch(fn.apply(new DutchAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> fingerprint(FingerprintAnalyzer v) {
            this._kind = Kind.Fingerprint;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> fingerprint(Function<FingerprintAnalyzer.Builder, ObjectBuilder<FingerprintAnalyzer>> fn) {
            return this.fingerprint(fn.apply(new FingerprintAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> icuAnalyzer(IcuAnalyzer v) {
            this._kind = Kind.IcuAnalyzer;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> icuAnalyzer(Function<IcuAnalyzer.Builder, ObjectBuilder<IcuAnalyzer>> fn) {
            return this.icuAnalyzer(fn.apply(new IcuAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> keyword(KeywordAnalyzer v) {
            this._kind = Kind.Keyword;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> keyword(Function<KeywordAnalyzer.Builder, ObjectBuilder<KeywordAnalyzer>> fn) {
            return this.keyword(fn.apply(new KeywordAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> kuromoji(KuromojiAnalyzer v) {
            this._kind = Kind.Kuromoji;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> kuromoji(Function<KuromojiAnalyzer.Builder, ObjectBuilder<KuromojiAnalyzer>> fn) {
            return this.kuromoji(fn.apply(new KuromojiAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> language(LanguageAnalyzer v) {
            this._kind = Kind.Language;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> language(Function<LanguageAnalyzer.Builder, ObjectBuilder<LanguageAnalyzer>> fn) {
            return this.language(fn.apply(new LanguageAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> nori(NoriAnalyzer v) {
            this._kind = Kind.Nori;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> nori(Function<NoriAnalyzer.Builder, ObjectBuilder<NoriAnalyzer>> fn) {
            return this.nori(fn.apply(new NoriAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> pattern(PatternAnalyzer v) {
            this._kind = Kind.Pattern;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> pattern(Function<PatternAnalyzer.Builder, ObjectBuilder<PatternAnalyzer>> fn) {
            return this.pattern(fn.apply(new PatternAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> phone(PhoneAnalyzer v) {
            this._kind = Kind.Phone;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> phone(Function<PhoneAnalyzer.Builder, ObjectBuilder<PhoneAnalyzer>> fn) {
            return this.phone(fn.apply(new PhoneAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> phoneSearch(PhoneSearchAnalyzer v) {
            this._kind = Kind.PhoneSearch;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> phoneSearch(Function<PhoneSearchAnalyzer.Builder, ObjectBuilder<PhoneSearchAnalyzer>> fn) {
            return this.phoneSearch(fn.apply(new PhoneSearchAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> simple(SimpleAnalyzer v) {
            this._kind = Kind.Simple;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> simple(Function<SimpleAnalyzer.Builder, ObjectBuilder<SimpleAnalyzer>> fn) {
            return this.simple(fn.apply(new SimpleAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> smartcn(SmartcnAnalyzer v) {
            this._kind = Kind.Smartcn;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> smartcn(Function<SmartcnAnalyzer.Builder, ObjectBuilder<SmartcnAnalyzer>> fn) {
            return this.smartcn(fn.apply(new SmartcnAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> snowball(SnowballAnalyzer v) {
            this._kind = Kind.Snowball;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> snowball(Function<SnowballAnalyzer.Builder, ObjectBuilder<SnowballAnalyzer>> fn) {
            return this.snowball(fn.apply(new SnowballAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> standard(StandardAnalyzer v) {
            this._kind = Kind.Standard;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> standard(Function<StandardAnalyzer.Builder, ObjectBuilder<StandardAnalyzer>> fn) {
            return this.standard(fn.apply(new StandardAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> stop(StopAnalyzer v) {
            this._kind = Kind.Stop;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> stop(Function<StopAnalyzer.Builder, ObjectBuilder<StopAnalyzer>> fn) {
            return this.stop(fn.apply(new StopAnalyzer.Builder()).build());
        }

        public ObjectBuilder<Analyzer> whitespace(WhitespaceAnalyzer v) {
            this._kind = Kind.Whitespace;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Analyzer> whitespace(Function<WhitespaceAnalyzer.Builder, ObjectBuilder<WhitespaceAnalyzer>> fn) {
            return this.whitespace(fn.apply(new WhitespaceAnalyzer.Builder()).build());
        }

        @Override
        public Analyzer build() {
            _checkSingleUse();
            return new Analyzer(this);
        }
    }

    protected static void setupAnalyzerDeserializer(ObjectDeserializer<Builder> op) {
        op.add(Builder::cjk, CjkAnalyzer._DESERIALIZER, "cjk");
        op.add(Builder::custom, CustomAnalyzer._DESERIALIZER, "custom");
        op.add(Builder::dutch, DutchAnalyzer._DESERIALIZER, "dutch");
        op.add(Builder::fingerprint, FingerprintAnalyzer._DESERIALIZER, "fingerprint");
        op.add(Builder::icuAnalyzer, IcuAnalyzer._DESERIALIZER, "icu_analyzer");
        op.add(Builder::keyword, KeywordAnalyzer._DESERIALIZER, "keyword");
        op.add(Builder::kuromoji, KuromojiAnalyzer._DESERIALIZER, "kuromoji");
        op.add(Builder::language, LanguageAnalyzer._DESERIALIZER, "language");
        op.add(Builder::nori, NoriAnalyzer._DESERIALIZER, "nori");
        op.add(Builder::pattern, PatternAnalyzer._DESERIALIZER, "pattern");
        op.add(Builder::phone, PhoneAnalyzer._DESERIALIZER, "phone");
        op.add(Builder::phoneSearch, PhoneSearchAnalyzer._DESERIALIZER, "phone-search");
        op.add(Builder::simple, SimpleAnalyzer._DESERIALIZER, "simple");
        op.add(Builder::smartcn, SmartcnAnalyzer._DESERIALIZER, "smartcn");
        op.add(Builder::snowball, SnowballAnalyzer._DESERIALIZER, "snowball");
        op.add(Builder::standard, StandardAnalyzer._DESERIALIZER, "standard");
        op.add(Builder::stop, StopAnalyzer._DESERIALIZER, "stop");
        op.add(Builder::whitespace, WhitespaceAnalyzer._DESERIALIZER, "whitespace");
        op.setTypeProperty("type", Kind.Custom.jsonValue());
    }

    public static final JsonpDeserializer<Analyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        Analyzer::setupAnalyzerDeserializer,
        Builder::build
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this._kind);
        result = 31 * result + Objects.hashCode(this._value);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Analyzer other = (Analyzer) o;
        return Objects.equals(this._kind, other._kind) && Objects.equals(this._value, other._value);
    }
}
