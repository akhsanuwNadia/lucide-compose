package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Venus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(15.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                curveTo(5.990385055541992,11.149985313415527,7.131871223449707,13.14078140258789,8.992227554321289,14.218559265136719)
                curveTo(10.852583885192871,15.296337127685547,13.147416114807129,15.296337127685547,15.007772445678711,14.218559265136719)
                curveTo(16.86812973022461,13.14078140258789,18.009614944458008,11.149985313415527,18.0,9.0)
                curveTo(18.009614944458008,6.8500142097473145,16.86812973022461,4.859218597412109,15.007772445678711,3.7814407348632812)
                curveTo(13.147416114807129,2.703662633895874,10.852583885192871,2.703662633895874,8.992227554321289,3.7814407348632812)
                curveTo(7.131871223449707,4.859218597412109,5.990385055541992,6.8500142097473145,6.0,9.0)
            }
}

public val LucideIcons.All.VenusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Venus: ImageVector
    @Composable get() = VenusDefinition.asImageVector()
