package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Popsicle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.600000381469727,14.399999618530273)
                curveTo(19.399999618530273,13.59999942779541,19.399999618530273,12.399999618530273,18.600000381469727,11.59999942779541)
                lineTo(10.5,3.4999990463256836)
                curveTo(9.233613967895508,2.2222352027893066,7.380347728729248,1.7197271585464478,5.641951560974121,2.1827526092529297)
                curveTo(3.903555393218994,2.645777940750122,2.5457794666290283,4.003553867340088,2.082753896713257,5.741950035095215)
                curveTo(1.6197283267974854,7.480346202850342,2.122236490249634,9.333612442016602,3.4000000953674316,10.599998474121094)
                lineTo(11.5,18.69999885559082)
                curveTo(12.399999618530273,19.399999618530273,13.600000381469727,19.399999618530273,14.399999618530273,18.599998474121094)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(16.5,16.5)
            }
}

public val LucideIcons.All.PopsicleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Popsicle: ImageVector
    @Composable get() = PopsicleDefinition.asImageVector()
