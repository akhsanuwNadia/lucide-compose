package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UndoDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                curveTo(20.996767044067383,13.452325820922852,18.90972328186035,10.237544059753418,15.670492172241211,8.790688514709473)
                curveTo(12.431262969970703,7.343832492828369,8.644279479980469,7.934881687164307,6.0,10.300000190734863)
                lineTo(3.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,13.0)
                lineTo(9.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                curveTo(10.998397827148438,17.35833168029785,11.188645362854004,17.69013023376465,11.49870491027832,17.869760513305664)
                curveTo(11.80876350402832,18.049388885498047,12.19123649597168,18.049388885498047,12.50129508972168,17.869760513305664)
                curveTo(12.811354637145996,17.69013023376465,13.001602172851562,17.35833168029785,13.0,17.0)
                curveTo(13.001602172851562,16.64166831970215,12.811354637145996,16.30986976623535,12.50129508972168,16.130239486694336)
                curveTo(12.19123649597168,15.950610160827637,11.80876350402832,15.950610160827637,11.49870491027832,16.130239486694336)
                curveTo(11.188645362854004,16.30986976623535,10.998397827148438,16.64166831970215,11.0,17.0)
            }
}

public val LucideIcons.All.UndoDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UndoDot: ImageVector
    @Composable get() = UndoDotDefinition.asImageVector()
