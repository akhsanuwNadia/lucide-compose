package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RedoDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                curveTo(10.998397827148438,17.35833168029785,11.188645362854004,17.69013023376465,11.49870491027832,17.869760513305664)
                curveTo(11.80876350402832,18.049388885498047,12.19123649597168,18.049388885498047,12.50129508972168,17.869760513305664)
                curveTo(12.811354637145996,17.69013023376465,13.001602172851562,17.35833168029785,13.0,17.0)
                curveTo(13.001602172851562,16.64166831970215,12.811354637145996,16.30986976623535,12.50129508972168,16.130239486694336)
                curveTo(12.19123649597168,15.950610160827637,11.80876350402832,15.950610160827637,11.49870491027832,16.130239486694336)
                curveTo(11.188645362854004,16.30986976623535,10.998397827148438,16.64166831970215,11.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,7.0)
                lineTo(21.0,13.0)
                lineTo(15.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,17.0)
                curveTo(3.0,12.029437065124512,7.029437065124512,8.0,12.0,8.0)
                curveTo(14.21487808227539,8.0022554397583,16.351146697998047,8.821158409118652,18.0,10.300000190734863)
                lineTo(21.0,13.0)
            }
}

public val LucideIcons.All.RedoDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RedoDot: ImageVector
    @Composable get() = RedoDotDefinition.asImageVector()
