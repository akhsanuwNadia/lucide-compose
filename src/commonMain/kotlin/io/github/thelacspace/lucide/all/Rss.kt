package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rss") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,11.0)
                curveTo(8.970562934875488,11.0,13.0,15.029437065124512,13.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                curveTo(12.836556434631348,4.0,20.0,11.163443565368652,20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,19.0)
                curveTo(3.9983975887298584,19.35833168029785,4.188645362854004,19.69013023376465,4.498704433441162,19.869760513305664)
                curveTo(4.8087639808654785,20.049388885498047,5.1912360191345215,20.049388885498047,5.501295566558838,19.869760513305664)
                curveTo(5.811354637145996,19.69013023376465,6.001602649688721,19.35833168029785,6.0,19.0)
                curveTo(6.001602649688721,18.64166831970215,5.811354637145996,18.30986976623535,5.501295566558838,18.130239486694336)
                curveTo(5.1912360191345215,17.950611114501953,4.8087639808654785,17.950611114501953,4.498704433441162,18.130239486694336)
                curveTo(4.188645362854004,18.30986976623535,3.9983975887298584,18.64166831970215,4.0,19.0)
            }
}

public val LucideIcons.All.RssDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rss: ImageVector
    @Composable get() = RssDefinition.asImageVector()
