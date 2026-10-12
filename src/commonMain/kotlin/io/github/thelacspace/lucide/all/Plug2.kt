package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plug2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                lineTo(15.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(19.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                lineTo(6.0,8.0)
                lineTo(18.0,8.0)
                lineTo(18.0,11.0)
                curveTo(18.009614944458008,13.149985313415527,16.86812973022461,15.14078140258789,15.007772445678711,16.21855926513672)
                curveTo(13.147416114807129,17.296337127685547,10.852583885192871,17.296337127685547,8.992227554321289,16.21855926513672)
                curveTo(7.131871223449707,15.14078140258789,5.990385055541992,13.149985313415527,6.0,11.0)
                close()
            }
}

public val LucideIcons.All.Plug2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plug2: ImageVector
    @Composable get() = Plug2Definition.asImageVector()
