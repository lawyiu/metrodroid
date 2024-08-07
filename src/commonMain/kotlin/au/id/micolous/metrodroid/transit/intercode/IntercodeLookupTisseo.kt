/*
 * IntercodeLookupTisseo.kt
 *
 * Copyright 2018 Google
 *
 * This program is free software: you can redistribute it &&/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package au.id.micolous.metrodroid.transit.intercode

import au.id.micolous.metrodroid.card.CardType
import au.id.micolous.metrodroid.multi.R
import au.id.micolous.metrodroid.multi.StringResource
import au.id.micolous.metrodroid.transit.CardInfo
import au.id.micolous.metrodroid.transit.TransitRegion

internal object IntercodeLookupTisseo : IntercodeLookupSTR("tisseo"), IntercodeLookupSingle {
    override val cardInfo: CardInfo
        get() =
                // https://www.tisseo.fr/les-tarifs/obtenir-une-carte-pastel
            CardInfo(
                    name = "Pastel",
                    locationId = R.string.location_toulouse,
                    imageId = R.drawable.pastel,
                    imageAlphaId = R.drawable.iso7810_id1_alpha,
                    cardType = CardType.ISO7816,
                    region = TransitRegion.FRANCE,
                    preview = true)

    private const val AGENCY_TISSEO = 1

    override val subscriptionMap: Map<Int, StringResource> = mapOf(
        300 to R.string.tisseo_10_tickets,
        307 to R.string.tisseo_1_ticket,
        335 to R.string.tisseo_mensuel,
        336 to R.string.tisseo_mensuel,
        455 to R.string.tisseo_annuel,
        672 to R.string.tisseo_annuel_26,
        674 to R.string.tisseo_mensuel_26,
        676 to R.string.tisseo_10_tickets_26,
        950 to R.string.tisseo_velo,
    )
}
