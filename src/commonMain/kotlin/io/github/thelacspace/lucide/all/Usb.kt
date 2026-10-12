package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Usb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,7.0)
                curveTo(8.998397827148438,7.358330726623535,9.188645362854004,7.690130233764648,9.49870491027832,7.869760036468506)
                curveTo(9.80876350402832,8.049389839172363,10.19123649597168,8.049389839172363,10.50129508972168,7.869760036468506)
                curveTo(10.811354637145996,7.690130233764648,11.001602172851562,7.358330726623535,11.0,7.0)
                curveTo(11.001602172851562,6.641669273376465,10.811354637145996,6.309869766235352,10.50129508972168,6.130239963531494)
                curveTo(10.19123649597168,5.950610637664795,9.80876350402832,5.950610637664795,9.49870491027832,6.130239963531494)
                curveTo(9.188645362854004,6.309869766235352,8.998397827148438,6.641669273376465,9.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                curveTo(2.9983975887298584,20.35833168029785,3.188645124435425,20.69013023376465,3.498704671859741,20.869760513305664)
                curveTo(3.8087639808654785,21.049388885498047,4.1912360191345215,21.049388885498047,4.501295566558838,20.869760513305664)
                curveTo(4.811354637145996,20.69013023376465,5.001602649688721,20.35833168029785,5.0,20.0)
                curveTo(5.001602649688721,19.64166831970215,4.811354637145996,19.30986976623535,4.501295566558838,19.130239486694336)
                curveTo(4.1912360191345215,18.950611114501953,3.8087639808654785,18.950611114501953,3.498704671859741,19.130239486694336)
                curveTo(3.188645124435425,19.30986976623535,2.9983975887298584,19.64166831970215,3.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.699999809265137,19.299999237060547)
                lineTo(19.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(18.0,4.0)
                lineTo(20.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.260000228881836,7.679999828338623)
                lineTo(5.0,12.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,14.0)
                lineTo(15.0,16.0)
                lineTo(18.5,12.5)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(19.0,11.0)
                lineTo(20.0,12.0)
                lineTo(19.0,13.0)
                close()
            }
}

public val LucideIcons.All.UsbDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Usb: ImageVector
    @Composable get() = UsbDefinition.asImageVector()
