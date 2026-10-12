package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                curveTo(10.998397827148438,12.358330726623535,11.188645362854004,12.690130233764648,11.49870491027832,12.869759559631348)
                curveTo(11.80876350402832,13.049389839172363,12.19123649597168,13.049389839172363,12.50129508972168,12.869759559631348)
                curveTo(12.811354637145996,12.690130233764648,13.001602172851562,12.358330726623535,13.0,12.0)
                curveTo(13.001602172851562,11.641669273376465,12.811354637145996,11.309869766235352,12.50129508972168,11.130240440368652)
                curveTo(12.19123649597168,10.950610160827637,11.80876350402832,10.950610160827637,11.49870491027832,11.130240440368652)
                curveTo(11.188645362854004,11.309869766235352,10.998397827148438,11.641669273376465,11.0,12.0)
            }
}

public val LucideIcons.All.SquareDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDot: ImageVector
    @Composable get() = SquareDotDefinition.asImageVector()
