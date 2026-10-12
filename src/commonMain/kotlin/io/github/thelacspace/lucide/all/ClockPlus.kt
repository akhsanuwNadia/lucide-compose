package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(15.644000053405762,13.822000503540039)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(22.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.920000076293945,13.267000198364258)
                curveTo(22.461658477783203,9.024554252624512,20.24537467956543,4.907276630401611,16.40586280822754,3.0231635570526123)
                curveTo(12.566350936889648,1.1390504837036133,7.953668594360352,1.9052410125732422,4.929454803466797,4.929454803466797)
                curveTo(1.9052410125732422,7.953668594360352,1.1390504837036133,12.566350936889648,3.0231635570526123,16.40586280822754)
                curveTo(4.907276630401611,20.24537467956543,9.024554252624512,22.461658477783203,13.267000198364258,21.920000076293945)
            }
}

public val LucideIcons.All.ClockPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockPlus: ImageVector
    @Composable get() = ClockPlusDefinition.asImageVector()
