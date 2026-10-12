package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Divide") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,6.0)
                curveTo(10.998397827148438,6.358330726623535,11.188645362854004,6.690130233764648,11.49870491027832,6.869760036468506)
                curveTo(11.80876350402832,7.049389362335205,12.19123649597168,7.049389362335205,12.50129508972168,6.869760036468506)
                curveTo(12.811354637145996,6.690130233764648,13.001602172851562,6.358330726623535,13.0,6.0)
                curveTo(13.001602172851562,5.641669273376465,12.811354637145996,5.309869766235352,12.50129508972168,5.130239963531494)
                curveTo(12.19123649597168,4.950610637664795,11.80876350402832,4.950610637664795,11.49870491027832,5.130239963531494)
                curveTo(11.188645362854004,5.309869766235352,10.998397827148438,5.641669273376465,11.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.0)
                lineTo(19.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,18.0)
                curveTo(10.998397827148438,18.35833168029785,11.188645362854004,18.69013023376465,11.49870491027832,18.869760513305664)
                curveTo(11.80876350402832,19.049388885498047,12.19123649597168,19.049388885498047,12.50129508972168,18.869760513305664)
                curveTo(12.811354637145996,18.69013023376465,13.001602172851562,18.35833168029785,13.0,18.0)
                curveTo(13.001602172851562,17.64166831970215,12.811354637145996,17.30986976623535,12.50129508972168,17.130239486694336)
                curveTo(12.19123649597168,16.950611114501953,11.80876350402832,16.950611114501953,11.49870491027832,17.130239486694336)
                curveTo(11.188645362854004,17.30986976623535,10.998397827148438,17.64166831970215,11.0,18.0)
            }
}

public val LucideIcons.All.DivideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Divide: ImageVector
    @Composable get() = DivideDefinition.asImageVector()
