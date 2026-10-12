package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PowerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.360000610351562,6.639999866485596)
                curveTo(20.546401977539062,8.827467918395996,21.45646095275879,11.984350204467773,20.770000457763672,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.159999847412109,6.159999847412109)
                curveTo(3.5547757148742676,8.34809684753418,2.4060816764831543,11.818243980407715,3.1911935806274414,15.128616333007812)
                curveTo(3.9763052463531494,18.438987731933594,6.561011791229248,21.02369499206543,9.871383666992188,21.808807373046875)
                curveTo(13.181756019592285,22.593917846679688,16.65190315246582,21.44522476196289,18.84000015258789,18.84000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.PowerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PowerOff: ImageVector
    @Composable get() = PowerOffDefinition.asImageVector()
