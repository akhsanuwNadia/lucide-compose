package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PersonStanding") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,5.0)
                curveTo(10.998397827148438,5.358330726623535,11.188645362854004,5.690130233764648,11.49870491027832,5.869760036468506)
                curveTo(11.80876350402832,6.049389362335205,12.19123649597168,6.049389362335205,12.50129508972168,5.869760036468506)
                curveTo(12.811354637145996,5.690130233764648,13.001602172851562,5.358330726623535,13.0,5.0)
                curveTo(13.001602172851562,4.641669273376465,12.811354637145996,4.309869766235352,12.50129508972168,4.130239963531494)
                curveTo(12.19123649597168,3.950610399246216,11.80876350402832,3.950610399246216,11.49870491027832,4.130239963531494)
                curveTo(11.188645362854004,4.309869766235352,10.998397827148438,4.641669273376465,11.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,20.0)
                lineTo(12.0,14.0)
                lineTo(15.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(12.0,10.0)
                lineTo(18.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,14.0)
            }
}

public val LucideIcons.All.PersonStandingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PersonStanding: ImageVector
    @Composable get() = PersonStandingDefinition.asImageVector()
