package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownToDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,9.0)
                lineTo(12.0,16.0)
                lineTo(5.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,21.0)
                curveTo(10.998397827148438,21.35833168029785,11.188645362854004,21.69013023376465,11.49870491027832,21.869760513305664)
                curveTo(11.80876350402832,22.049388885498047,12.19123649597168,22.049388885498047,12.50129508972168,21.869760513305664)
                curveTo(12.811354637145996,21.69013023376465,13.001602172851562,21.35833168029785,13.0,21.0)
                curveTo(13.001602172851562,20.64166831970215,12.811354637145996,20.30986976623535,12.50129508972168,20.130239486694336)
                curveTo(12.19123649597168,19.950611114501953,11.80876350402832,19.950611114501953,11.49870491027832,20.130239486694336)
                curveTo(11.188645362854004,20.30986976623535,10.998397827148438,20.64166831970215,11.0,21.0)
            }
}

public val LucideIcons.All.ArrowDownToDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownToDot: ImageVector
    @Composable get() = ArrowDownToDotDefinition.asImageVector()
