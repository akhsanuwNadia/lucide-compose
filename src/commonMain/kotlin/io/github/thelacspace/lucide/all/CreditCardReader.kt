package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardReader") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                lineTo(15.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.96299934387207,7.734000205993652)
                curveTo(16.843339920043945,7.300355911254883,16.448850631713867,6.999988079071045,15.99899959564209,7.0)
                lineTo(8.003000259399414,7.0)
                curveTo(7.553149223327637,6.999988079071045,7.158660888671875,7.300355911254883,7.039000511169434,7.734000205993652)
                lineTo(4.072999954223633,18.466999053955078)
                curveTo(3.906580924987793,19.068876266479492,4.030837059020996,19.71394157409668,4.408926486968994,20.2109317779541)
                curveTo(4.787015438079834,20.707921981811523,5.375539779663086,20.99979019165039,6.0,21.0)
                lineTo(18.0,21.0)
                curveTo(18.624229431152344,20.999704360961914,19.212522506713867,20.70796775817871,19.590566635131836,20.21123504638672)
                curveTo(19.968610763549805,19.714500427246094,20.09304428100586,19.069740295410156,19.927000045776367,18.468000411987305)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.677999973297119,8.5)
                curveTo(2.247174024581909,8.12049388885498,2.0002214908599854,7.57413911819458,2.0,7.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(20.0,3.0)
                curveTo(21.104570388793945,3.0,22.0,3.895430564880371,22.0,5.0)
                lineTo(22.0,7.0)
                curveTo(21.999998092651367,7.573475360870361,21.753822326660156,8.119359016418457,21.323999404907227,8.49899959564209)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(11.0,7.0)
            }
}

public val LucideIcons.All.CreditCardReaderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardReader: ImageVector
    @Composable get() = CreditCardReaderDefinition.asImageVector()
